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

package com.google.cloud.domains.v1beta1.samples;

// [START domains_v1beta1_generated_domainsclient_retrieveregisterparameters_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.domains.v1beta1.DomainsClient;
import com.google.cloud.domains.v1beta1.LocationName;
import com.google.cloud.domains.v1beta1.RetrieveRegisterParametersRequest;
import com.google.cloud.domains.v1beta1.RetrieveRegisterParametersResponse;

public class AsyncRetrieveRegisterParameters {

  public static void main(String[] args) throws Exception {
    asyncRetrieveRegisterParameters();
  }

  public static void asyncRetrieveRegisterParameters() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      RetrieveRegisterParametersRequest request =
          RetrieveRegisterParametersRequest.newBuilder()
              .setDomainName("domainName-1244085905")
              .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .build();
      ApiFuture<RetrieveRegisterParametersResponse> future =
          domainsClient.retrieveRegisterParametersCallable().futureCall(request);
      // Do something.
      RetrieveRegisterParametersResponse response = future.get();
    }
  }
}
// [END domains_v1beta1_generated_domainsclient_retrieveregisterparameters_async]
