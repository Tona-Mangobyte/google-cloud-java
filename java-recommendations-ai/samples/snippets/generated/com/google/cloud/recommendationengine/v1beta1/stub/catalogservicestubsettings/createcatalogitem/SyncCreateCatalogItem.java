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

package com.google.cloud.recommendationengine.v1beta1.stub.samples;

// [START recommendationengine_v1beta1_generated_catalogservicestubsettings_createcatalogitem_sync]
import com.google.cloud.recommendationengine.v1beta1.stub.CatalogServiceStubSettings;
import java.time.Duration;

public class SyncCreateCatalogItem {

  public static void main(String[] args) throws Exception {
    syncCreateCatalogItem();
  }

  public static void syncCreateCatalogItem() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    CatalogServiceStubSettings.Builder catalogServiceSettingsBuilder =
        CatalogServiceStubSettings.newBuilder();
    catalogServiceSettingsBuilder
        .createCatalogItemSettings()
        .setRetrySettings(
            catalogServiceSettingsBuilder
                .createCatalogItemSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    CatalogServiceStubSettings catalogServiceSettings = catalogServiceSettingsBuilder.build();
  }
}
// [END recommendationengine_v1beta1_generated_catalogservicestubsettings_createcatalogitem_sync]
