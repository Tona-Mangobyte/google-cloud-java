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

package com.google.cloud.scheduler.v1beta1.samples;

// [START scheduler_v1beta1_generated_cloudschedulerclient_listjobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.scheduler.v1beta1.CloudSchedulerClient;
import com.google.cloud.scheduler.v1beta1.Job;
import com.google.cloud.scheduler.v1beta1.ListJobsRequest;
import com.google.cloud.scheduler.v1beta1.LocationName;

public class AsyncListJobs {

  public static void main(String[] args) throws Exception {
    asyncListJobs();
  }

  public static void asyncListJobs() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
      ListJobsRequest request =
          ListJobsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Job> future = cloudSchedulerClient.listJobsPagedCallable().futureCall(request);
      // Do something.
      for (Job element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END scheduler_v1beta1_generated_cloudschedulerclient_listjobs_async]
