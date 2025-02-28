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

// [START dialogflow_v2_generated_knowledgebasesclient_createknowledgebase_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2.CreateKnowledgeBaseRequest;
import com.google.cloud.dialogflow.v2.KnowledgeBase;
import com.google.cloud.dialogflow.v2.KnowledgeBasesClient;
import com.google.cloud.dialogflow.v2.ProjectName;

public class AsyncCreateKnowledgeBase {

  public static void main(String[] args) throws Exception {
    asyncCreateKnowledgeBase();
  }

  public static void asyncCreateKnowledgeBase() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
      CreateKnowledgeBaseRequest request =
          CreateKnowledgeBaseRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setKnowledgeBase(KnowledgeBase.newBuilder().build())
              .build();
      ApiFuture<KnowledgeBase> future =
          knowledgeBasesClient.createKnowledgeBaseCallable().futureCall(request);
      // Do something.
      KnowledgeBase response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_knowledgebasesclient_createknowledgebase_async]
