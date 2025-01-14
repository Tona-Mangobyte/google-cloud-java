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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_contentserviceclient_createcontent_lakenamecontent_sync]
import com.google.cloud.dataplex.v1.Content;
import com.google.cloud.dataplex.v1.ContentServiceClient;
import com.google.cloud.dataplex.v1.LakeName;

public class SyncCreateContentLakenameContent {

  public static void main(String[] args) throws Exception {
    syncCreateContentLakenameContent();
  }

  public static void syncCreateContentLakenameContent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ContentServiceClient contentServiceClient = ContentServiceClient.create()) {
      LakeName parent = LakeName.of("[PROJECT]", "[LOCATION]", "[LAKE]");
      Content content = Content.newBuilder().build();
      Content response = contentServiceClient.createContent(parent, content);
    }
  }
}
// [END dataplex_v1_generated_contentserviceclient_createcontent_lakenamecontent_sync]
