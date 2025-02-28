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

package com.google.cloud.talent.v4.samples;

// [START talent_v4_generated_tenantserviceclient_createtenant_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4.CreateTenantRequest;
import com.google.cloud.talent.v4.ProjectName;
import com.google.cloud.talent.v4.Tenant;
import com.google.cloud.talent.v4.TenantServiceClient;

public class AsyncCreateTenant {

  public static void main(String[] args) throws Exception {
    asyncCreateTenant();
  }

  public static void asyncCreateTenant() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
      CreateTenantRequest request =
          CreateTenantRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setTenant(Tenant.newBuilder().build())
              .build();
      ApiFuture<Tenant> future = tenantServiceClient.createTenantCallable().futureCall(request);
      // Do something.
      Tenant response = future.get();
    }
  }
}
// [END talent_v4_generated_tenantserviceclient_createtenant_async]
