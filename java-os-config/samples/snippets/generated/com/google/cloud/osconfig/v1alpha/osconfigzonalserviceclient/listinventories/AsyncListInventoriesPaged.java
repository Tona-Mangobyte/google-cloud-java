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

package com.google.cloud.osconfig.v1alpha.samples;

// [START osconfig_v1alpha_generated_osconfigzonalserviceclient_listinventories_paged_async]
import com.google.cloud.osconfig.v1alpha.InstanceName;
import com.google.cloud.osconfig.v1alpha.Inventory;
import com.google.cloud.osconfig.v1alpha.InventoryView;
import com.google.cloud.osconfig.v1alpha.ListInventoriesRequest;
import com.google.cloud.osconfig.v1alpha.ListInventoriesResponse;
import com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient;
import com.google.common.base.Strings;

public class AsyncListInventoriesPaged {

  public static void main(String[] args) throws Exception {
    asyncListInventoriesPaged();
  }

  public static void asyncListInventoriesPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      ListInventoriesRequest request =
          ListInventoriesRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .setView(InventoryView.forNumber(0))
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      while (true) {
        ListInventoriesResponse response =
            osConfigZonalServiceClient.listInventoriesCallable().call(request);
        for (Inventory element : response.getInventoriesList()) {
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
// [END osconfig_v1alpha_generated_osconfigzonalserviceclient_listinventories_paged_async]
