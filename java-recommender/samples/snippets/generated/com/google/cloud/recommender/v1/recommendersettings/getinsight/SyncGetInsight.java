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

package com.google.cloud.recommender.v1.samples;

// [START recommender_v1_generated_recommendersettings_getinsight_sync]
import com.google.cloud.recommender.v1.RecommenderSettings;
import java.time.Duration;

public class SyncGetInsight {

  public static void main(String[] args) throws Exception {
    syncGetInsight();
  }

  public static void syncGetInsight() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    RecommenderSettings.Builder recommenderSettingsBuilder = RecommenderSettings.newBuilder();
    recommenderSettingsBuilder
        .getInsightSettings()
        .setRetrySettings(
            recommenderSettingsBuilder
                .getInsightSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    RecommenderSettings recommenderSettings = recommenderSettingsBuilder.build();
  }
}
// [END recommender_v1_generated_recommendersettings_getinsight_sync]
