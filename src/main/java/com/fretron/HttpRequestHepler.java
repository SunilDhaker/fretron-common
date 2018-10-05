package com.fretron;

import org.glassfish.jersey.client.ClientProperties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Deprecated
/**
 * @deprecated Use Jersey Client and make helper classes in  Microservice only
 */
public class HttpRequestHepler {

    private Client client;

    public HttpRequestHepler(Client client) {

        this.client = client;
    }

    public static HttpRequestHepler getInstance() {
        Client client = ClientBuilder.newBuilder().build();
        return new HttpRequestHepler(client);
    }

    public Response makeGetRequest(String uri, String authToken) {
        return client
                .target(uri)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + authToken)
                .get();
    }

    public Response makeGetRequest(String uri, String authToken, int timeout) {
        return client
                .property(ClientProperties.CONNECT_TIMEOUT, timeout)
                .target(uri)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + authToken)
                .get();
    }

    public Response makePostRequest(String uri, Object requestObject, String authToken) {

        HashMap<String, String> headermap = new HashMap<String, String>();
        headermap.put("Authorization", "Bearer " + authToken);
        return makePostRequest(uri, requestObject, headermap);
    }

    public String makePostRequestAndGetData(String uri, Object requestObject, String authToken) {

        Response response = makePostRequest(uri, requestObject, authToken);
        return response.readEntity(String.class);
    }

    public String makeGetRequestAndGetData(String uri, String authToken, int timeout) {

        Response response = makeGetRequest(uri, authToken, timeout);
        return response.readEntity(String.class);
    }

    public Response makePostRequest(String uri, Object requestObject,
                                    HashMap<String, String> headers) {

        MultivaluedMap<String, Object> headerMap = new MultivaluedHashMap<>(headers);
        return client
                .target(uri)
                .request(MediaType.APPLICATION_JSON)
                .headers(headerMap)
                .post(Entity.entity(requestObject.toString(), MediaType.APPLICATION_JSON));
    }

    public Response makePostRequest(String uri, Object requestObject) {
        return client
                .target(uri)
                .property(ClientProperties.READ_TIMEOUT, 5000)
                .property(ClientProperties.CONNECT_TIMEOUT, 5000)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(requestObject.toString(), MediaType.APPLICATION_JSON));
    }

    public String makePostRequestAndGetData(String uri, Object requestObject,
                                            HashMap<String, String> headers) {
        return makePostRequest(uri, requestObject, headers).readEntity(String.class);
    }

}
