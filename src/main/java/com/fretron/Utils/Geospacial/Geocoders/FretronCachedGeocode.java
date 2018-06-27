/*
 * Copyright 2014 - 2015 Anton Tananaev (anton@traccar.org)
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

import com.fretron.Constant.Constants;
import com.fretron.Context;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

public class FretronCachedGeocode extends JsonGeocoder {

  public FretronCachedGeocode(String url, String key, int cacheSize) {
    super(formatUrl(url), cacheSize);
  }

  private static String formatUrl(String url) {
    if (url == null) {
      url = Context.getProp(Constants.KEY_FRETRON_GEOCODER_URL);
    }
    url += "?lat=%f&lng=%f";

    return url;
  }

  @Override
  public String getAddressSync(
      final AddressFormat format, final double latitude,
      final double longitude) throws IOException {

    HttpGet getReq = new HttpGet(String.format(url, latitude, longitude));
    HttpResponse response = httpClient.execute(getReq);

    if (response.getStatusLine().getStatusCode() < 300) {
      try (JsonReader reader = Json.createReader(response.getEntity().getContent())) {
        String address = parseAddress2(reader.readObject());
        return address;
      }
    }
    return null;
  }

  @Override
  public Address parseAddress(JsonObject json) {
    return null;
  }

  public String parseAddress2(JsonObject json) {
    try {
      return json.getString("address");
    } catch (Exception e) {
      return null;
    }
  }
}
