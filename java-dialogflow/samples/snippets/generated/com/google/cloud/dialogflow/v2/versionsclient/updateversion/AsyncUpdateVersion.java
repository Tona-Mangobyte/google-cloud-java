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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_versionsclient_updateversion_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2.UpdateVersionRequest;
import com.google.cloud.dialogflow.v2.Version;
import com.google.cloud.dialogflow.v2.VersionsClient;
import com.google.protobuf.FieldMask;

public class AsyncUpdateVersion {

  public static void main(String[] args) throws Exception {
    asyncUpdateVersion();
  }

  public static void asyncUpdateVersion() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VersionsClient versionsClient = VersionsClient.create()) {
      UpdateVersionRequest request =
          UpdateVersionRequest.newBuilder()
              .setVersion(Version.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Version> future = versionsClient.updateVersionCallable().futureCall(request);
      // Do something.
      Version response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_versionsclient_updateversion_async]
