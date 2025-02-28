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

package com.google.cloud.automl.v1.samples;

// [START automl_v1_generated_automlclient_importdata_stringinputconfig_sync]
import com.google.cloud.automl.v1.AutoMlClient;
import com.google.cloud.automl.v1.DatasetName;
import com.google.cloud.automl.v1.InputConfig;
import com.google.protobuf.Empty;

public class SyncImportDataStringInputconfig {

  public static void main(String[] args) throws Exception {
    syncImportDataStringInputconfig();
  }

  public static void syncImportDataStringInputconfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AutoMlClient autoMlClient = AutoMlClient.create()) {
      String name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString();
      InputConfig inputConfig = InputConfig.newBuilder().build();
      autoMlClient.importDataAsync(name, inputConfig).get();
    }
  }
}
// [END automl_v1_generated_automlclient_importdata_stringinputconfig_sync]
