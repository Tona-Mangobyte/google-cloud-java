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

package com.google.cloud.vision.v1.samples;

// [START vision_v1_generated_productsearchclient_listproductsinproductset_string_sync]
import com.google.cloud.vision.v1.Product;
import com.google.cloud.vision.v1.ProductSearchClient;
import com.google.cloud.vision.v1.ProductSetName;

public class SyncListProductsInProductSetString {

  public static void main(String[] args) throws Exception {
    syncListProductsInProductSetString();
  }

  public static void syncListProductsInProductSetString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
      String name = ProductSetName.of("[PROJECT]", "[LOCATION]", "[PRODUCT_SET]").toString();
      for (Product element : productSearchClient.listProductsInProductSet(name).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END vision_v1_generated_productsearchclient_listproductsinproductset_string_sync]
