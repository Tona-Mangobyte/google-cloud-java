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

// [START retail_v2_generated_servingconfigserviceclient_removecontrol_servingconfigname_sync]
import com.google.cloud.retail.v2.ServingConfig;
import com.google.cloud.retail.v2.ServingConfigName;
import com.google.cloud.retail.v2.ServingConfigServiceClient;

public class SyncRemoveControlServingconfigname {

  public static void main(String[] args) throws Exception {
    syncRemoveControlServingconfigname();
  }

  public static void syncRemoveControlServingconfigname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ServingConfigServiceClient servingConfigServiceClient =
        ServingConfigServiceClient.create()) {
      ServingConfigName servingConfig =
          ServingConfigName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[SERVING_CONFIG]");
      ServingConfig response = servingConfigServiceClient.removeControl(servingConfig);
    }
  }
}
// [END retail_v2_generated_servingconfigserviceclient_removecontrol_servingconfigname_sync]
