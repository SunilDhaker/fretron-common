package com.fretron;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HttpRequestHepler {

    public static HttpEntity makePostRequest(String uri, Object requestObject , String authToken ){
        HttpResponse response = null;
        HttpEntity entity = null;
        final HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 3000);

        DefaultHttpClient httpClient = new DefaultHttpClient(httpParams);
        HttpPost post = new HttpPost(uri);
        post.setHeader("Content-Type", "application/json");
        if(authToken!=null){
            post.setHeader("Authorization","Bearer "+authToken);
        }
        StringEntity se = null;
        try {
            if (requestObject!=null) {
                se = new StringEntity(requestObject.toString());
                post.setEntity(se);
            }

            try {
                response = httpClient.execute(post);
                entity = response.getEntity();
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Connection exception: "+e.getMessage());
            }
            finally {
                httpClient.getConnectionManager().shutdown();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return entity;
    }


    public static HttpEntity makeGetRequest(String uri, String authToken ){
        HttpResponse response = null;
        HttpEntity entity = null;
        final HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 3000);

        DefaultHttpClient httpClient = new DefaultHttpClient(httpParams);
        HttpGet post = new HttpGet(uri);
        post.setHeader("Content-Type", "application/json");
        if(authToken!=null){
            post.setHeader("Authorization","Bearer "+authToken);
        }
        StringEntity se = null;

            try {
                response = httpClient.execute(post);
                entity = response.getEntity();
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Connection exception: "+e.getMessage());
            }
            finally {
                httpClient.getConnectionManager().shutdown();
            }

        return entity;
    }


    public static HttpEntity makePostRequest(String uri, Object requestObject , HashMap<String ,String> headers ,int requestTimeout){
        HttpResponse response;
        HttpEntity entity = null;
        final HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, requestTimeout);
        DefaultHttpClient httpClient = new DefaultHttpClient(httpParams);
        HttpPost post = new HttpPost(uri);
        addHeaders(post ,headers);
        StringEntity se;
        try {
            if (requestObject!=null) {
                se = new StringEntity(requestObject.toString());
                post.setEntity(se);
            }

            try {
                response = httpClient.execute(post);
                entity = response.getEntity();
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Connection exception: "+e.getMessage());
            }
            finally {
                httpClient.getConnectionManager().shutdown();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return entity;
    }


    private static void addHeaders(HttpRequestBase request , HashMap<String ,String> headerMap){
        if (headerMap != null) {
            Iterator iterator = headerMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> header = (Map.Entry<String, String>) iterator.next();
                request.addHeader(header.getKey(), header.getValue());
            }

        }

    }



}
