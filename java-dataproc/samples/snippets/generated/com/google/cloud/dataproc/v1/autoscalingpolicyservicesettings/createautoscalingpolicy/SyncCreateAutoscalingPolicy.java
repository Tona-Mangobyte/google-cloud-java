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

// [START dataproc_v1_generated_autoscalingpolicyservicesettings_createautoscalingpolicy_sync]
import com.google.cloud.dataproc.v1.AutoscalingPolicyServiceSettings;
import java.time.Duration;

public class SyncCreateAutoscalingPolicy {

  public static void main(String[] args) throws Exception {
    syncCreateAutoscalingPolicy();
  }

  public static void syncCreateAutoscalingPolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    AutoscalingPolicyServiceSettings.Builder autoscalingPolicyServiceSettingsBuilder =
        AutoscalingPolicyServiceSettings.newBuilder();
    autoscalingPolicyServiceSettingsBuilder
        .createAutoscalingPolicySettings()
        .setRetrySettings(
            autoscalingPolicyServiceSettingsBuilder
                .createAutoscalingPolicySettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    AutoscalingPolicyServiceSettings autoscalingPolicyServiceSettings =
        autoscalingPolicyServiceSettingsBuilder.build();
  }
}
// [END dataproc_v1_generated_autoscalingpolicyservicesettings_createautoscalingpolicy_sync]
