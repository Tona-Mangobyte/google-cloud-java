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

package com.google.cloud.speech.v1.samples;

// [START speech_v1_generated_adaptationclient_updatephraseset_sync]
import com.google.cloud.speech.v1.AdaptationClient;
import com.google.cloud.speech.v1.PhraseSet;
import com.google.cloud.speech.v1.UpdatePhraseSetRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdatePhraseSet {

  public static void main(String[] args) throws Exception {
    syncUpdatePhraseSet();
  }

  public static void syncUpdatePhraseSet() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AdaptationClient adaptationClient = AdaptationClient.create()) {
      UpdatePhraseSetRequest request =
          UpdatePhraseSetRequest.newBuilder()
              .setPhraseSet(PhraseSet.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      PhraseSet response = adaptationClient.updatePhraseSet(request);
    }
  }
}
// [END speech_v1_generated_adaptationclient_updatephraseset_sync]
