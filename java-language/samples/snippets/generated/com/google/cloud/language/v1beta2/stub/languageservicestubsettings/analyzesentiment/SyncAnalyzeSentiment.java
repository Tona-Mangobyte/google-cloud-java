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

package com.google.cloud.language.v1beta2.stub.samples;

// [START language_v1beta2_generated_languageservicestubsettings_analyzesentiment_sync]
import com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings;
import java.time.Duration;

public class SyncAnalyzeSentiment {

  public static void main(String[] args) throws Exception {
    syncAnalyzeSentiment();
  }

  public static void syncAnalyzeSentiment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    LanguageServiceStubSettings.Builder languageServiceSettingsBuilder =
        LanguageServiceStubSettings.newBuilder();
    languageServiceSettingsBuilder
        .analyzeSentimentSettings()
        .setRetrySettings(
            languageServiceSettingsBuilder
                .analyzeSentimentSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    LanguageServiceStubSettings languageServiceSettings = languageServiceSettingsBuilder.build();
  }
}
// [END language_v1beta2_generated_languageservicestubsettings_analyzesentiment_sync]
