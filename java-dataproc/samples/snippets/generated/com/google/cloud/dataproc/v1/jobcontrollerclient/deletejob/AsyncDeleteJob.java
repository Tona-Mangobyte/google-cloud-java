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

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_jobcontrollerclient_deletejob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dataproc.v1.DeleteJobRequest;
import com.google.cloud.dataproc.v1.JobControllerClient;
import com.google.protobuf.Empty;

public class AsyncDeleteJob {

  public static void main(String[] args) throws Exception {
    asyncDeleteJob();
  }

  public static void asyncDeleteJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (JobControllerClient jobControllerClient = JobControllerClient.create()) {
      DeleteJobRequest request =
          DeleteJobRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setRegion("region-934795532")
              .setJobId("jobId101296568")
              .build();
      ApiFuture<Empty> future = jobControllerClient.deleteJobCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dataproc_v1_generated_jobcontrollerclient_deletejob_async]
