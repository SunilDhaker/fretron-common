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


import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public abstract class JsonGeocoder implements Geocoder {

  public final String url;
  DefaultHttpClient httpClient;
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
    httpClient = new DefaultHttpClient();
  }

  @Override
  public String getAddressSync(
      final AddressFormat format, final double latitude,
      final double longitude) throws IOException {

    HttpGet getReq = new HttpGet(String.format(url, latitude, longitude));
    HttpResponse response = httpClient.execute(getReq);

    if (response.getStatusLine().getStatusCode() < 300) {
      try (JsonReader reader = Json.createReader(response.getEntity().getContent())) {
        Address address = parseAddress(reader.readObject());
        if (address != null) {
          return format.format(address);
        } else {
          return null;
        }
      }
    }
    return null;
  }


  public abstract Address parseAddress(JsonObject json);

}
