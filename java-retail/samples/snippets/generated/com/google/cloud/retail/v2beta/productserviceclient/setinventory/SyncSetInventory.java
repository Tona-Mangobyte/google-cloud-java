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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_productserviceclient_setinventory_sync]
import com.google.cloud.retail.v2beta.Product;
import com.google.cloud.retail.v2beta.ProductServiceClient;
import com.google.cloud.retail.v2beta.SetInventoryRequest;
import com.google.cloud.retail.v2beta.SetInventoryResponse;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;

public class SyncSetInventory {

  public static void main(String[] args) throws Exception {
    syncSetInventory();
  }

  public static void syncSetInventory() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProductServiceClient productServiceClient = ProductServiceClient.create()) {
      SetInventoryRequest request =
          SetInventoryRequest.newBuilder()
              .setInventory(Product.newBuilder().build())
              .setSetMask(FieldMask.newBuilder().build())
              .setSetTime(Timestamp.newBuilder().build())
              .setAllowMissing(true)
              .build();
      SetInventoryResponse response = productServiceClient.setInventoryAsync(request).get();
    }
  }
}
// [END retail_v2beta_generated_productserviceclient_setinventory_sync]
