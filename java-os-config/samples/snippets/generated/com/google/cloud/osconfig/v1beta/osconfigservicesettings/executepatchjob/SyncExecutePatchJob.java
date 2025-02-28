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

package com.google.cloud.osconfig.v1beta.samples;

// [START osconfig_v1beta_generated_osconfigservicesettings_executepatchjob_sync]
import com.google.cloud.osconfig.v1beta.OsConfigServiceSettings;
import java.time.Duration;

public class SyncExecutePatchJob {

  public static void main(String[] args) throws Exception {
    syncExecutePatchJob();
  }

  public static void syncExecutePatchJob() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    OsConfigServiceSettings.Builder osConfigServiceSettingsBuilder =
        OsConfigServiceSettings.newBuilder();
    osConfigServiceSettingsBuilder
        .executePatchJobSettings()
        .setRetrySettings(
            osConfigServiceSettingsBuilder
                .executePatchJobSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    OsConfigServiceSettings osConfigServiceSettings = osConfigServiceSettingsBuilder.build();
  }
}
// [END osconfig_v1beta_generated_osconfigservicesettings_executepatchjob_sync]
