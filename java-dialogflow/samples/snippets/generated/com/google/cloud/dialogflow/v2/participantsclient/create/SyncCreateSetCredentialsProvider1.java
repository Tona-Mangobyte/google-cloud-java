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

// [START dialogflow_v2_generated_participantsclient_create_setcredentialsprovider1_sync]
import com.google.cloud.dialogflow.v2.ParticipantsClient;
import com.google.cloud.dialogflow.v2.ParticipantsSettings;

public class SyncCreateSetCredentialsProvider1 {

  public static void main(String[] args) throws Exception {
    syncCreateSetCredentialsProvider1();
  }

  public static void syncCreateSetCredentialsProvider1() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    ParticipantsSettings participantsSettings =
        ParticipantsSettings.newBuilder()
            .setTransportChannelProvider(
                ParticipantsSettings.defaultHttpJsonTransportProviderBuilder().build())
            .build();
    ParticipantsClient participantsClient = ParticipantsClient.create(participantsSettings);
  }
}
// [END dialogflow_v2_generated_participantsclient_create_setcredentialsprovider1_sync]
