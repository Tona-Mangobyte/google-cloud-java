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

// [START dialogflow_v2beta1_generated_knowledgebasesclient_listknowledgebases_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.KnowledgeBase;
import com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient;
import com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest;
import com.google.cloud.dialogflow.v2beta1.ProjectName;

public class AsyncListKnowledgeBases {

  public static void main(String[] args) throws Exception {
    asyncListKnowledgeBases();
  }

  public static void asyncListKnowledgeBases() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
      ListKnowledgeBasesRequest request =
          ListKnowledgeBasesRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<KnowledgeBase> future =
          knowledgeBasesClient.listKnowledgeBasesPagedCallable().futureCall(request);
      // Do something.
      for (KnowledgeBase element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v2beta1_generated_knowledgebasesclient_listknowledgebases_async]
