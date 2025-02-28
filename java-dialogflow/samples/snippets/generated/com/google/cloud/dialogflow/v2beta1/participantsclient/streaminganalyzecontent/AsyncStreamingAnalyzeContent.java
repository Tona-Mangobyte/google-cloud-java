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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_participantsclient_streaminganalyzecontent_async]
import com.google.api.gax.rpc.BidiStream;
import com.google.cloud.dialogflow.v2beta1.AssistQueryParameters;
import com.google.cloud.dialogflow.v2beta1.OutputAudioConfig;
import com.google.cloud.dialogflow.v2beta1.ParticipantName;
import com.google.cloud.dialogflow.v2beta1.ParticipantsClient;
import com.google.cloud.dialogflow.v2beta1.QueryParameters;
import com.google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest;
import com.google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentResponse;
import com.google.protobuf.Struct;

public class AsyncStreamingAnalyzeContent {

  public static void main(String[] args) throws Exception {
    asyncStreamingAnalyzeContent();
  }

  public static void asyncStreamingAnalyzeContent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ParticipantsClient participantsClient = ParticipantsClient.create()) {
      BidiStream<StreamingAnalyzeContentRequest, StreamingAnalyzeContentResponse> bidiStream =
          participantsClient.streamingAnalyzeContentCallable().call();
      StreamingAnalyzeContentRequest request =
          StreamingAnalyzeContentRequest.newBuilder()
              .setParticipant(
                  ParticipantName.ofProjectConversationParticipantName(
                          "[PROJECT]", "[CONVERSATION]", "[PARTICIPANT]")
                      .toString())
              .setReplyAudioConfig(OutputAudioConfig.newBuilder().build())
              .setQueryParams(QueryParameters.newBuilder().build())
              .setAssistQueryParams(AssistQueryParameters.newBuilder().build())
              .setCxParameters(Struct.newBuilder().build())
              .setCxCurrentPage("cxCurrentPage1596907507")
              .setEnablePartialAutomatedAgentReply(true)
              .build();
      bidiStream.send(request);
      for (StreamingAnalyzeContentResponse response : bidiStream) {
        // Do something when a response is received.
      }
    }
  }
}
// [END dialogflow_v2beta1_generated_participantsclient_streaminganalyzecontent_async]
