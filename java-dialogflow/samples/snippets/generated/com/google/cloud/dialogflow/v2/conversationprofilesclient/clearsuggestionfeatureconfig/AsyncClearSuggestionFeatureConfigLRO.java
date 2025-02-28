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

// [START dialogflow_v2_generated_conversationprofilesclient_clearsuggestionfeatureconfig_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigOperationMetadata;
import com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest;
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfilesClient;

public class AsyncClearSuggestionFeatureConfigLRO {

  public static void main(String[] args) throws Exception {
    asyncClearSuggestionFeatureConfigLRO();
  }

  public static void asyncClearSuggestionFeatureConfigLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ConversationProfilesClient conversationProfilesClient =
        ConversationProfilesClient.create()) {
      ClearSuggestionFeatureConfigRequest request =
          ClearSuggestionFeatureConfigRequest.newBuilder()
              .setConversationProfile("conversationProfile1691597734")
              .build();
      OperationFuture<ConversationProfile, ClearSuggestionFeatureConfigOperationMetadata> future =
          conversationProfilesClient
              .clearSuggestionFeatureConfigOperationCallable()
              .futureCall(request);
      // Do something.
      ConversationProfile response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_conversationprofilesclient_clearsuggestionfeatureconfig_lro_async]
