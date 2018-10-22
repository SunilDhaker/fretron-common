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
import org.glassfish.jersey.client.ClientProperties;
import org.json.JSONException;
import org.json.JSONObject;

import javax.json.JsonObject;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class FretronCachedGeocode extends JsonGeocoder {

  public FretronCachedGeocode(String url, int cacheSize) {
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
      final double longitude) {
      Response response = httpClient
          .target(String.format(url, latitude, longitude))
          .property(ClientProperties.CONNECT_TIMEOUT, 3000)
          .request(MediaType.APPLICATION_JSON_TYPE)
          .get();

      if (response.getStatus()< 300) {
          try {
              String responseString = response.readEntity(String.class);
              JSONObject json = new JSONObject(responseString);
              return json.getString("address");
          } catch (JSONException ignored) {

          }
      }
    return null;
  }

  @Override
  public Address parseAddress(JsonObject json) {
    return null;
  }


}
