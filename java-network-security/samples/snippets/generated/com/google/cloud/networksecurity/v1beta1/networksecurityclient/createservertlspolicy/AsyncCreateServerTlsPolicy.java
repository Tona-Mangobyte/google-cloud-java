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

package com.google.cloud.networksecurity.v1beta1.samples;

// [START networksecurity_v1beta1_generated_networksecurityclient_createservertlspolicy_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.networksecurity.v1beta1.CreateServerTlsPolicyRequest;
import com.google.cloud.networksecurity.v1beta1.LocationName;
import com.google.cloud.networksecurity.v1beta1.NetworkSecurityClient;
import com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy;
import com.google.longrunning.Operation;

public class AsyncCreateServerTlsPolicy {

  public static void main(String[] args) throws Exception {
    asyncCreateServerTlsPolicy();
  }

  public static void asyncCreateServerTlsPolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (NetworkSecurityClient networkSecurityClient = NetworkSecurityClient.create()) {
      CreateServerTlsPolicyRequest request =
          CreateServerTlsPolicyRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setServerTlsPolicyId("serverTlsPolicyId-1966046011")
              .setServerTlsPolicy(ServerTlsPolicy.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          networkSecurityClient.createServerTlsPolicyCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END networksecurity_v1beta1_generated_networksecurityclient_createservertlspolicy_async]
