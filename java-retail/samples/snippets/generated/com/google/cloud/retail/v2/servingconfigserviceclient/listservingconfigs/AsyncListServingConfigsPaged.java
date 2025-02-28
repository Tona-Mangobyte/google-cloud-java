/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.retail.v2.samples;

// [START retail_v2_generated_servingconfigserviceclient_listservingconfigs_paged_async]
import com.google.cloud.retail.v2.CatalogName;
import com.google.cloud.retail.v2.ListServingConfigsRequest;
import com.google.cloud.retail.v2.ListServingConfigsResponse;
import com.google.cloud.retail.v2.ServingConfig;
import com.google.cloud.retail.v2.ServingConfigServiceClient;
import com.google.common.base.Strings;

public class AsyncListServingConfigsPaged {

  public static void main(String[] args) throws Exception {
    asyncListServingConfigsPaged();
  }

  public static void asyncListServingConfigsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ServingConfigServiceClient servingConfigServiceClient =
        ServingConfigServiceClient.create()) {
      ListServingConfigsRequest request =
          ListServingConfigsRequest.newBuilder()
              .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListServingConfigsResponse response =
            servingConfigServiceClient.listServingConfigsCallable().call(request);
        for (ServingConfig element : response.getServingConfigsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END retail_v2_generated_servingconfigserviceclient_listservingconfigs_paged_async]
