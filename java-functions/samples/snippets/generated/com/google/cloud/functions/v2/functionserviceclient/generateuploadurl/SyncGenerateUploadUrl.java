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

package com.google.cloud.functions.v2.samples;

// [START functions_v2_generated_functionserviceclient_generateuploadurl_sync]
import com.google.cloud.functions.v2.FunctionServiceClient;
import com.google.cloud.functions.v2.GenerateUploadUrlRequest;
import com.google.cloud.functions.v2.GenerateUploadUrlResponse;
import com.google.cloud.functions.v2.LocationName;

public class SyncGenerateUploadUrl {

  public static void main(String[] args) throws Exception {
    syncGenerateUploadUrl();
  }

  public static void syncGenerateUploadUrl() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (FunctionServiceClient functionServiceClient = FunctionServiceClient.create()) {
      GenerateUploadUrlRequest request =
          GenerateUploadUrlRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .build();
      GenerateUploadUrlResponse response = functionServiceClient.generateUploadUrl(request);
    }
  }
}
// [END functions_v2_generated_functionserviceclient_generateuploadurl_sync]
