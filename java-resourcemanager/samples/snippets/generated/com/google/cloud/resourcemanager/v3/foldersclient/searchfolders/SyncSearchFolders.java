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

package com.google.cloud.resourcemanager.v3.samples;

// [START resourcemanager_v3_generated_foldersclient_searchfolders_sync]
import com.google.cloud.resourcemanager.v3.Folder;
import com.google.cloud.resourcemanager.v3.FoldersClient;
import com.google.cloud.resourcemanager.v3.SearchFoldersRequest;

public class SyncSearchFolders {

  public static void main(String[] args) throws Exception {
    syncSearchFolders();
  }

  public static void syncSearchFolders() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (FoldersClient foldersClient = FoldersClient.create()) {
      SearchFoldersRequest request =
          SearchFoldersRequest.newBuilder()
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setQuery("query107944136")
              .build();
      for (Folder element : foldersClient.searchFolders(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END resourcemanager_v3_generated_foldersclient_searchfolders_sync]
