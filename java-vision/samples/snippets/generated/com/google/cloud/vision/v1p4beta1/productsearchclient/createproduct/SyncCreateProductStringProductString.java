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

package com.google.cloud.vision.v1p4beta1.samples;

// [START vision_v1p4beta1_generated_productsearchclient_createproduct_stringproductstring_sync]
import com.google.cloud.vision.v1p4beta1.LocationName;
import com.google.cloud.vision.v1p4beta1.Product;
import com.google.cloud.vision.v1p4beta1.ProductSearchClient;

public class SyncCreateProductStringProductString {

  public static void main(String[] args) throws Exception {
    syncCreateProductStringProductString();
  }

  public static void syncCreateProductStringProductString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
      String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      Product product = Product.newBuilder().build();
      String productId = "productId-1051830678";
      Product response = productSearchClient.createProduct(parent, product, productId);
    }
  }
}
// [END vision_v1p4beta1_generated_productsearchclient_createproduct_stringproductstring_sync]
