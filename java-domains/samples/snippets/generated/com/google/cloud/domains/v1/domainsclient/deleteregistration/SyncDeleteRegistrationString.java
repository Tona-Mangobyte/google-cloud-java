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

package com.google.cloud.domains.v1.samples;

// [START domains_v1_generated_domainsclient_deleteregistration_string_sync]
import com.google.cloud.domains.v1.DomainsClient;
import com.google.cloud.domains.v1.RegistrationName;
import com.google.protobuf.Empty;

public class SyncDeleteRegistrationString {

  public static void main(String[] args) throws Exception {
    syncDeleteRegistrationString();
  }

  public static void syncDeleteRegistrationString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      String name = RegistrationName.of("[PROJECT]", "[LOCATION]", "[REGISTRATION]").toString();
      domainsClient.deleteRegistrationAsync(name).get();
    }
  }
}
// [END domains_v1_generated_domainsclient_deleteregistration_string_sync]
