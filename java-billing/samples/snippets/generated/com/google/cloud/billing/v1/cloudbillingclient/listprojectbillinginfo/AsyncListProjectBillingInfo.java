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

package com.google.cloud.billing.v1.samples;

// [START billing_v1_generated_cloudbillingclient_listprojectbillinginfo_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.billing.v1.BillingAccountName;
import com.google.cloud.billing.v1.CloudBillingClient;
import com.google.cloud.billing.v1.ListProjectBillingInfoRequest;
import com.google.cloud.billing.v1.ProjectBillingInfo;

public class AsyncListProjectBillingInfo {

  public static void main(String[] args) throws Exception {
    asyncListProjectBillingInfo();
  }

  public static void asyncListProjectBillingInfo() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudBillingClient cloudBillingClient = CloudBillingClient.create()) {
      ListProjectBillingInfoRequest request =
          ListProjectBillingInfoRequest.newBuilder()
              .setName(BillingAccountName.of("[BILLING_ACCOUNT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<ProjectBillingInfo> future =
          cloudBillingClient.listProjectBillingInfoPagedCallable().futureCall(request);
      // Do something.
      for (ProjectBillingInfo element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END billing_v1_generated_cloudbillingclient_listprojectbillinginfo_async]
