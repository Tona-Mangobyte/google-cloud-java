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

package com.google.cloud.managedidentities.v1beta1.samples;

// [START managedidentities_v1beta1_generated_managedidentitiesserviceclient_deletedomain_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.managedidentities.v1beta1.DeleteDomainRequest;
import com.google.cloud.managedidentities.v1beta1.DomainName;
import com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceClient;
import com.google.cloud.managedidentities.v1beta1.OpMetadata;
import com.google.protobuf.Empty;

public class AsyncDeleteDomainLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteDomainLRO();
  }

  public static void asyncDeleteDomainLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ManagedIdentitiesServiceClient managedIdentitiesServiceClient =
        ManagedIdentitiesServiceClient.create()) {
      DeleteDomainRequest request =
          DeleteDomainRequest.newBuilder()
              .setName(DomainName.of("[PROJECT]", "[LOCATION]", "[DOMAIN]").toString())
              .build();
      OperationFuture<Empty, OpMetadata> future =
          managedIdentitiesServiceClient.deleteDomainOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END managedidentities_v1beta1_generated_managedidentitiesserviceclient_deletedomain_lro_async]
