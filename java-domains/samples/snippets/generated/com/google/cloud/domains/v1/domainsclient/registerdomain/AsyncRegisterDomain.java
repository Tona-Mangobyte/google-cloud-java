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

// [START domains_v1_generated_domainsclient_registerdomain_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.domains.v1.ContactNotice;
import com.google.cloud.domains.v1.DomainNotice;
import com.google.cloud.domains.v1.DomainsClient;
import com.google.cloud.domains.v1.LocationName;
import com.google.cloud.domains.v1.RegisterDomainRequest;
import com.google.cloud.domains.v1.Registration;
import com.google.longrunning.Operation;
import com.google.type.Money;
import java.util.ArrayList;

public class AsyncRegisterDomain {

  public static void main(String[] args) throws Exception {
    asyncRegisterDomain();
  }

  public static void asyncRegisterDomain() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      RegisterDomainRequest request =
          RegisterDomainRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setRegistration(Registration.newBuilder().build())
              .addAllDomainNotices(new ArrayList<DomainNotice>())
              .addAllContactNotices(new ArrayList<ContactNotice>())
              .setYearlyPrice(Money.newBuilder().build())
              .setValidateOnly(true)
              .build();
      ApiFuture<Operation> future = domainsClient.registerDomainCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END domains_v1_generated_domainsclient_registerdomain_async]
