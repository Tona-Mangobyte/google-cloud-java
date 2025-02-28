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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_dataplexserviceclient_createenvironment_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dataplex.v1.CreateEnvironmentRequest;
import com.google.cloud.dataplex.v1.DataplexServiceClient;
import com.google.cloud.dataplex.v1.Environment;
import com.google.cloud.dataplex.v1.LakeName;
import com.google.cloud.dataplex.v1.OperationMetadata;

public class AsyncCreateEnvironmentLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateEnvironmentLRO();
  }

  public static void asyncCreateEnvironmentLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataplexServiceClient dataplexServiceClient = DataplexServiceClient.create()) {
      CreateEnvironmentRequest request =
          CreateEnvironmentRequest.newBuilder()
              .setParent(LakeName.of("[PROJECT]", "[LOCATION]", "[LAKE]").toString())
              .setEnvironmentId("environmentId-950205810")
              .setEnvironment(Environment.newBuilder().build())
              .setValidateOnly(true)
              .build();
      OperationFuture<Environment, OperationMetadata> future =
          dataplexServiceClient.createEnvironmentOperationCallable().futureCall(request);
      // Do something.
      Environment response = future.get();
    }
  }
}
// [END dataplex_v1_generated_dataplexserviceclient_createenvironment_lro_async]
