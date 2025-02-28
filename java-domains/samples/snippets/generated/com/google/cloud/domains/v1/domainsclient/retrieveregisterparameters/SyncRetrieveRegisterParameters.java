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

// [START domains_v1_generated_domainsclient_retrieveregisterparameters_sync]
import com.google.cloud.domains.v1.DomainsClient;
import com.google.cloud.domains.v1.LocationName;
import com.google.cloud.domains.v1.RetrieveRegisterParametersRequest;
import com.google.cloud.domains.v1.RetrieveRegisterParametersResponse;

public class SyncRetrieveRegisterParameters {

  public static void main(String[] args) throws Exception {
    syncRetrieveRegisterParameters();
  }

  public static void syncRetrieveRegisterParameters() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      RetrieveRegisterParametersRequest request =
          RetrieveRegisterParametersRequest.newBuilder()
              .setDomainName("domainName-1244085905")
              .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .build();
      RetrieveRegisterParametersResponse response =
          domainsClient.retrieveRegisterParameters(request);
    }
  }
}
// [END domains_v1_generated_domainsclient_retrieveregisterparameters_sync]
