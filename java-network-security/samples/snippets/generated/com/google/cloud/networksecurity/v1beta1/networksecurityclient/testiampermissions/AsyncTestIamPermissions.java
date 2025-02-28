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

// [START networksecurity_v1beta1_generated_networksecurityclient_testiampermissions_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyName;
import com.google.cloud.networksecurity.v1beta1.NetworkSecurityClient;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import java.util.ArrayList;

public class AsyncTestIamPermissions {

  public static void main(String[] args) throws Exception {
    asyncTestIamPermissions();
  }

  public static void asyncTestIamPermissions() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (NetworkSecurityClient networkSecurityClient = NetworkSecurityClient.create()) {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource(
                  AuthorizationPolicyName.of("[PROJECT]", "[LOCATION]", "[AUTHORIZATION_POLICY]")
                      .toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      ApiFuture<TestIamPermissionsResponse> future =
          networkSecurityClient.testIamPermissionsCallable().futureCall(request);
      // Do something.
      TestIamPermissionsResponse response = future.get();
    }
  }
}
// [END networksecurity_v1beta1_generated_networksecurityclient_testiampermissions_async]
