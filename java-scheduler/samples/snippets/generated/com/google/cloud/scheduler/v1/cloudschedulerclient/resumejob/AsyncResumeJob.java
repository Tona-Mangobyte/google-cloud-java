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

package com.google.cloud.scheduler.v1.samples;

// [START scheduler_v1_generated_cloudschedulerclient_resumejob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.scheduler.v1.CloudSchedulerClient;
import com.google.cloud.scheduler.v1.Job;
import com.google.cloud.scheduler.v1.JobName;
import com.google.cloud.scheduler.v1.ResumeJobRequest;

public class AsyncResumeJob {

  public static void main(String[] args) throws Exception {
    asyncResumeJob();
  }

  public static void asyncResumeJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudSchedulerClient cloudSchedulerClient = CloudSchedulerClient.create()) {
      ResumeJobRequest request =
          ResumeJobRequest.newBuilder()
              .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
              .build();
      ApiFuture<Job> future = cloudSchedulerClient.resumeJobCallable().futureCall(request);
      // Do something.
      Job response = future.get();
    }
  }
}
// [END scheduler_v1_generated_cloudschedulerclient_resumejob_async]
