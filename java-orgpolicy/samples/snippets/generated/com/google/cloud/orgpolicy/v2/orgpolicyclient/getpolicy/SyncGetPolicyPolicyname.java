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

package com.google.cloud.orgpolicy.v2.samples;

// [START orgpolicy_v2_generated_orgpolicyclient_getpolicy_policyname_sync]
import com.google.cloud.orgpolicy.v2.OrgPolicyClient;
import com.google.cloud.orgpolicy.v2.Policy;
import com.google.cloud.orgpolicy.v2.PolicyName;

public class SyncGetPolicyPolicyname {

  public static void main(String[] args) throws Exception {
    syncGetPolicyPolicyname();
  }

  public static void syncGetPolicyPolicyname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OrgPolicyClient orgPolicyClient = OrgPolicyClient.create()) {
      PolicyName name = PolicyName.ofProjectPolicyName("[PROJECT]", "[POLICY]");
      Policy response = orgPolicyClient.getPolicy(name);
    }
  }
}
// [END orgpolicy_v2_generated_orgpolicyclient_getpolicy_policyname_sync]
