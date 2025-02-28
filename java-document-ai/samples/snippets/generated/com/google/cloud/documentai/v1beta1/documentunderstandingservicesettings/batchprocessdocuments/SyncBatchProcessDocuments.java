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

package com.google.cloud.documentai.v1beta1.samples;

// [START documentai_v1beta1_generated_documentunderstandingservicesettings_batchprocessdocuments_sync]
import com.google.cloud.documentai.v1beta1.DocumentUnderstandingServiceSettings;
import java.time.Duration;

public class SyncBatchProcessDocuments {

  public static void main(String[] args) throws Exception {
    syncBatchProcessDocuments();
  }

  public static void syncBatchProcessDocuments() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    DocumentUnderstandingServiceSettings.Builder documentUnderstandingServiceSettingsBuilder =
        DocumentUnderstandingServiceSettings.newBuilder();
    documentUnderstandingServiceSettingsBuilder
        .batchProcessDocumentsSettings()
        .setRetrySettings(
            documentUnderstandingServiceSettingsBuilder
                .batchProcessDocumentsSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    DocumentUnderstandingServiceSettings documentUnderstandingServiceSettings =
        documentUnderstandingServiceSettingsBuilder.build();
  }
}
// [END documentai_v1beta1_generated_documentunderstandingservicesettings_batchprocessdocuments_sync]
