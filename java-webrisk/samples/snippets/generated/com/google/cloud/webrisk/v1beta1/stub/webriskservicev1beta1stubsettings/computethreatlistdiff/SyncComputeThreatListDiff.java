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

package com.google.cloud.webrisk.v1beta1.stub.samples;

// [START webrisk_v1beta1_generated_webriskservicev1beta1stubsettings_computethreatlistdiff_sync]
import com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings;
import java.time.Duration;

public class SyncComputeThreatListDiff {

  public static void main(String[] args) throws Exception {
    syncComputeThreatListDiff();
  }

  public static void syncComputeThreatListDiff() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    WebRiskServiceV1Beta1StubSettings.Builder webRiskServiceV1Beta1SettingsBuilder =
        WebRiskServiceV1Beta1StubSettings.newBuilder();
    webRiskServiceV1Beta1SettingsBuilder
        .computeThreatListDiffSettings()
        .setRetrySettings(
            webRiskServiceV1Beta1SettingsBuilder
                .computeThreatListDiffSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    WebRiskServiceV1Beta1StubSettings webRiskServiceV1Beta1Settings =
        webRiskServiceV1Beta1SettingsBuilder.build();
  }
}
// [END webrisk_v1beta1_generated_webriskservicev1beta1stubsettings_computethreatlistdiff_sync]
