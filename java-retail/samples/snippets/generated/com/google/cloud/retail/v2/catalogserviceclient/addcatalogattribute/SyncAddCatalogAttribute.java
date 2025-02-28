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

// [START retail_v2_generated_catalogserviceclient_addcatalogattribute_sync]
import com.google.cloud.retail.v2.AddCatalogAttributeRequest;
import com.google.cloud.retail.v2.AttributesConfig;
import com.google.cloud.retail.v2.AttributesConfigName;
import com.google.cloud.retail.v2.CatalogAttribute;
import com.google.cloud.retail.v2.CatalogServiceClient;

public class SyncAddCatalogAttribute {

  public static void main(String[] args) throws Exception {
    syncAddCatalogAttribute();
  }

  public static void syncAddCatalogAttribute() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      AddCatalogAttributeRequest request =
          AddCatalogAttributeRequest.newBuilder()
              .setAttributesConfig(
                  AttributesConfigName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setCatalogAttribute(CatalogAttribute.newBuilder().build())
              .build();
      AttributesConfig response = catalogServiceClient.addCatalogAttribute(request);
    }
  }
}
// [END retail_v2_generated_catalogserviceclient_addcatalogattribute_sync]
