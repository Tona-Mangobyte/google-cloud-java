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

package com.google.cloud.kms.v1.samples;

// [START kms_v1_generated_keymanagementserviceclient_listkeyrings_paged_async]
import com.google.cloud.kms.v1.KeyManagementServiceClient;
import com.google.cloud.kms.v1.KeyRing;
import com.google.cloud.kms.v1.ListKeyRingsRequest;
import com.google.cloud.kms.v1.ListKeyRingsResponse;
import com.google.cloud.kms.v1.LocationName;
import com.google.common.base.Strings;

public class AsyncListKeyRingsPaged {

  public static void main(String[] args) throws Exception {
    asyncListKeyRingsPaged();
  }

  public static void asyncListKeyRingsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KeyManagementServiceClient keyManagementServiceClient =
        KeyManagementServiceClient.create()) {
      ListKeyRingsRequest request =
          ListKeyRingsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      while (true) {
        ListKeyRingsResponse response =
            keyManagementServiceClient.listKeyRingsCallable().call(request);
        for (KeyRing element : response.getKeyRingsList()) {
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
// [END kms_v1_generated_keymanagementserviceclient_listkeyrings_paged_async]
