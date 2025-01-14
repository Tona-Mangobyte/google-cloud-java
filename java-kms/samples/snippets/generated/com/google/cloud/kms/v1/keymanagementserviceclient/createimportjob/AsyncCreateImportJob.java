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

package com.google.cloud.kms.v1.samples;

// [START kms_v1_generated_keymanagementserviceclient_createimportjob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.kms.v1.CreateImportJobRequest;
import com.google.cloud.kms.v1.ImportJob;
import com.google.cloud.kms.v1.KeyManagementServiceClient;
import com.google.cloud.kms.v1.KeyRingName;

public class AsyncCreateImportJob {

  public static void main(String[] args) throws Exception {
    asyncCreateImportJob();
  }

  public static void asyncCreateImportJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KeyManagementServiceClient keyManagementServiceClient =
        KeyManagementServiceClient.create()) {
      CreateImportJobRequest request =
          CreateImportJobRequest.newBuilder()
              .setParent(KeyRingName.of("[PROJECT]", "[LOCATION]", "[KEY_RING]").toString())
              .setImportJobId("importJobId1449444627")
              .setImportJob(ImportJob.newBuilder().build())
              .build();
      ApiFuture<ImportJob> future =
          keyManagementServiceClient.createImportJobCallable().futureCall(request);
      // Do something.
      ImportJob response = future.get();
    }
  }
}
// [END kms_v1_generated_keymanagementserviceclient_createimportjob_async]
