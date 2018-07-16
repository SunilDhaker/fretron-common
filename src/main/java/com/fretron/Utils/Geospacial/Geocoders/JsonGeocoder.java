/*
 * Copyright 2015 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fretron.Utils.Geospacial.Geocoders;


import com.fretron.Logger.Log;
import org.glassfish.jersey.client.ClientProperties;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class JsonGeocoder implements Geocoder {

    public final String url;
    Client httpClient;
    private Map<Map.Entry<Double, Double>, String> cache;

    public JsonGeocoder(String url, final int cacheSize) {
        this.url = url;
        if (cacheSize > 0) {
            this.cache = Collections
                .synchronizedMap(new LinkedHashMap<Map.Entry<Double, Double>, String>() {
                    @Override
                    protected boolean removeEldestEntry(Map.Entry eldest) {
                        return size() > cacheSize;
                    }
                });
        }
        httpClient = ClientBuilder.newBuilder().build();
        Log.info("json geo-coder http-Client initialized");
    }

    @Override
    public String getAddressSync(
        final AddressFormat format, final double latitude,
        final double longitude) throws IOException {

        Response response = httpClient
            .target(String.format(url, latitude, longitude))
            .property(ClientProperties.CONNECT_TIMEOUT, 3000)
            .request(MediaType.APPLICATION_JSON_TYPE)
            .get();

        try {
            if (response.getStatus() < 300) {
                Address address = parseAddress(response.readEntity(JsonObject.class));
                if (address != null) {
                    return format.format(address);
                } else {
                    return null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public abstract Address parseAddress(JsonObject json);

}
