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

package com.google.cloud.asset.v1.samples;

// [START asset_v1_generated_assetserviceclient_listsavedqueries_sync]
import com.google.cloud.asset.v1.AssetServiceClient;
import com.google.cloud.asset.v1.ListSavedQueriesRequest;
import com.google.cloud.asset.v1.ProjectName;
import com.google.cloud.asset.v1.SavedQuery;

public class SyncListSavedQueries {

  public static void main(String[] args) throws Exception {
    syncListSavedQueries();
  }

  public static void syncListSavedQueries() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      ListSavedQueriesRequest request =
          ListSavedQueriesRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (SavedQuery element : assetServiceClient.listSavedQueries(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END asset_v1_generated_assetserviceclient_listsavedqueries_sync]
