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

// [START speech_v1_generated_adaptationclient_listphraseset_paged_async]
import com.google.cloud.speech.v1.AdaptationClient;
import com.google.cloud.speech.v1.ListPhraseSetRequest;
import com.google.cloud.speech.v1.ListPhraseSetResponse;
import com.google.cloud.speech.v1.LocationName;
import com.google.cloud.speech.v1.PhraseSet;
import com.google.common.base.Strings;

public class AsyncListPhraseSetPaged {

  public static void main(String[] args) throws Exception {
    asyncListPhraseSetPaged();
  }

  public static void asyncListPhraseSetPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AdaptationClient adaptationClient = AdaptationClient.create()) {
      ListPhraseSetRequest request =
          ListPhraseSetRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListPhraseSetResponse response = adaptationClient.listPhraseSetCallable().call(request);
        for (PhraseSet element : response.getPhraseSetsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END speech_v1_generated_adaptationclient_listphraseset_paged_async]
