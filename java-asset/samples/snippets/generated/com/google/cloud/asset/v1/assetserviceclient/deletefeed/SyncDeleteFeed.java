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

// [START asset_v1_generated_assetserviceclient_deletefeed_sync]
import com.google.cloud.asset.v1.AssetServiceClient;
import com.google.cloud.asset.v1.DeleteFeedRequest;
import com.google.cloud.asset.v1.FeedName;
import com.google.protobuf.Empty;

public class SyncDeleteFeed {

  public static void main(String[] args) throws Exception {
    syncDeleteFeed();
  }

  public static void syncDeleteFeed() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      DeleteFeedRequest request =
          DeleteFeedRequest.newBuilder()
              .setName(FeedName.ofProjectFeedName("[PROJECT]", "[FEED]").toString())
              .build();
      assetServiceClient.deleteFeed(request);
    }
  }
}
// [END asset_v1_generated_assetserviceclient_deletefeed_sync]
