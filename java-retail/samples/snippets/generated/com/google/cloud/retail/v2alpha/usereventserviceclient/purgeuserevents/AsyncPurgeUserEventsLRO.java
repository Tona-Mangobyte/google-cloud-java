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

package com.google.cloud.retail.v2alpha.samples;

// [START retail_v2alpha_generated_usereventserviceclient_purgeuserevents_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.retail.v2alpha.CatalogName;
import com.google.cloud.retail.v2alpha.PurgeMetadata;
import com.google.cloud.retail.v2alpha.PurgeUserEventsRequest;
import com.google.cloud.retail.v2alpha.PurgeUserEventsResponse;
import com.google.cloud.retail.v2alpha.UserEventServiceClient;

public class AsyncPurgeUserEventsLRO {

  public static void main(String[] args) throws Exception {
    asyncPurgeUserEventsLRO();
  }

  public static void asyncPurgeUserEventsLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      PurgeUserEventsRequest request =
          PurgeUserEventsRequest.newBuilder()
              .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setFilter("filter-1274492040")
              .setForce(true)
              .build();
      OperationFuture<PurgeUserEventsResponse, PurgeMetadata> future =
          userEventServiceClient.purgeUserEventsOperationCallable().futureCall(request);
      // Do something.
      PurgeUserEventsResponse response = future.get();
    }
  }
}
// [END retail_v2alpha_generated_usereventserviceclient_purgeuserevents_lro_async]
