package com.fretron;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
            se = new StringEntity(requestObject.toString());
            post.setEntity(se);

            try {
                response = httpClient.execute(post);
                entity = response.getEntity();
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Connection expection: "+e.getMessage());
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return entity;
    }
}
