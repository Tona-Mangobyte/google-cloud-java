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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_participantsclient_suggestsmartreplies_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2.MessageName;
import com.google.cloud.dialogflow.v2.ParticipantName;
import com.google.cloud.dialogflow.v2.ParticipantsClient;
import com.google.cloud.dialogflow.v2.SuggestSmartRepliesRequest;
import com.google.cloud.dialogflow.v2.SuggestSmartRepliesResponse;
import com.google.cloud.dialogflow.v2.TextInput;

public class AsyncSuggestSmartReplies {

  public static void main(String[] args) throws Exception {
    asyncSuggestSmartReplies();
  }

  public static void asyncSuggestSmartReplies() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
      SuggestSmartRepliesRequest request =
          SuggestSmartRepliesRequest.newBuilder()
              .setParent(
                  ParticipantName.ofProjectConversationParticipantName(
                          "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
                      .toString())
              .setCurrentTextInput(TextInput.newBuilder().build())
              .setLatestMessage(
                  MessageName.ofProjectConversationMessageName(
                          "[PROJECT]", "[CONVERSATION]", "[MESSAGE]")
                      .toString())
              .setContextSize(1116903569)
              .build();
      ApiFuture<SuggestSmartRepliesResponse> future =
          participantsClient.suggestSmartRepliesCallable().futureCall(request);
      // Do something.
      SuggestSmartRepliesResponse response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_participantsclient_suggestsmartreplies_async]
