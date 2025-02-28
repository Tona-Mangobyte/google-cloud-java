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

package com.google.cloud.phishingprotection.v1beta1.samples;

// [START
// phishingprotection_v1beta1_generated_phishingprotectionservicev1beta1settings_reportphishing_sync]
import com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings;
import java.time.Duration;

public class SyncReportPhishing {

  public static void main(String[] args) throws Exception {
    syncReportPhishing();
  }

  public static void syncReportPhishing() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    PhishingProtectionServiceV1Beta1Settings.Builder
        phishingProtectionServiceV1Beta1SettingsBuilder =
            PhishingProtectionServiceV1Beta1Settings.newBuilder();
    phishingProtectionServiceV1Beta1SettingsBuilder
        .reportPhishingSettings()
        .setRetrySettings(
            phishingProtectionServiceV1Beta1SettingsBuilder
                .reportPhishingSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    PhishingProtectionServiceV1Beta1Settings phishingProtectionServiceV1Beta1Settings =
        phishingProtectionServiceV1Beta1SettingsBuilder.build();
  }
}
// [END
// phishingprotection_v1beta1_generated_phishingprotectionservicev1beta1settings_reportphishing_sync]
