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

// [START retail_v2beta_generated_catalogserviceclient_batchremovecatalogattributes_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.retail.v2beta.AttributesConfigName;
import com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesRequest;
import com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse;
import com.google.cloud.retail.v2beta.CatalogServiceClient;
import java.util.ArrayList;

public class AsyncBatchRemoveCatalogAttributes {

  public static void main(String[] args) throws Exception {
    asyncBatchRemoveCatalogAttributes();
  }

  public static void asyncBatchRemoveCatalogAttributes() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      BatchRemoveCatalogAttributesRequest request =
          BatchRemoveCatalogAttributesRequest.newBuilder()
              .setAttributesConfig(
                  AttributesConfigName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .addAllAttributeKeys(new ArrayList<String>())
              .build();
      ApiFuture<BatchRemoveCatalogAttributesResponse> future =
          catalogServiceClient.batchRemoveCatalogAttributesCallable().futureCall(request);
      // Do something.
      BatchRemoveCatalogAttributesResponse response = future.get();
    }
  }
}
// [END retail_v2beta_generated_catalogserviceclient_batchremovecatalogattributes_async]
