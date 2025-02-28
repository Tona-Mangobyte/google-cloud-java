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

// [START osconfig_v1alpha_generated_osconfigzonalserviceclient_getinventory_sync]
import com.google.cloud.osconfig.v1alpha.GetInventoryRequest;
import com.google.cloud.osconfig.v1alpha.Inventory;
import com.google.cloud.osconfig.v1alpha.InventoryName;
import com.google.cloud.osconfig.v1alpha.InventoryView;
import com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient;

public class SyncGetInventory {

  public static void main(String[] args) throws Exception {
    syncGetInventory();
  }

  public static void syncGetInventory() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      GetInventoryRequest request =
          GetInventoryRequest.newBuilder()
              .setName(InventoryName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .setView(InventoryView.forNumber(0))
              .build();
      Inventory response = osConfigZonalServiceClient.getInventory(request);
    }
  }
}
// [END osconfig_v1alpha_generated_osconfigzonalserviceclient_getinventory_sync]
