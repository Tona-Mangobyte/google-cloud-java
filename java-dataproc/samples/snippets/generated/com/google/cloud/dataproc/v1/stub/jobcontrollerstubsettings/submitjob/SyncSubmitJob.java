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

package com.google.cloud.dataproc.v1.stub.samples;

// [START dataproc_v1_generated_jobcontrollerstubsettings_submitjob_sync]
import com.google.cloud.dataproc.v1.stub.JobControllerStubSettings;
import java.time.Duration;

public class SyncSubmitJob {

  public static void main(String[] args) throws Exception {
    syncSubmitJob();
  }

  public static void syncSubmitJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    JobControllerStubSettings.Builder jobControllerSettingsBuilder =
        JobControllerStubSettings.newBuilder();
    jobControllerSettingsBuilder
        .submitJobSettings()
        .setRetrySettings(
            jobControllerSettingsBuilder
                .submitJobSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    JobControllerStubSettings jobControllerSettings = jobControllerSettingsBuilder.build();
  }
}
// [END dataproc_v1_generated_jobcontrollerstubsettings_submitjob_sync]
