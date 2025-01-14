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

// [START talent_v4_generated_jobserviceclient_listjobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4.Job;
import com.google.cloud.talent.v4.JobServiceClient;
import com.google.cloud.talent.v4.JobView;
import com.google.cloud.talent.v4.ListJobsRequest;
import com.google.cloud.talent.v4.TenantName;

public class AsyncListJobs {

  public static void main(String[] args) throws Exception {
    asyncListJobs();
  }

  public static void asyncListJobs() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      ListJobsRequest request =
          ListJobsRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setFilter("filter-1274492040")
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .setJobView(JobView.forNumber(0))
              .build();
      ApiFuture<Job> future = jobServiceClient.listJobsPagedCallable().futureCall(request);
      // Do something.
      for (Job element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END talent_v4_generated_jobserviceclient_listjobs_async]
