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

package com.google.cloud.asset.v1p5beta1.samples;

// [START asset_v1p5beta1_generated_assetserviceclient_listassets_paged_async]
import com.google.cloud.asset.v1p5beta1.Asset;
import com.google.cloud.asset.v1p5beta1.AssetServiceClient;
import com.google.cloud.asset.v1p5beta1.ContentType;
import com.google.cloud.asset.v1p5beta1.ListAssetsRequest;
import com.google.cloud.asset.v1p5beta1.ListAssetsResponse;
import com.google.common.base.Strings;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;

public class AsyncListAssetsPaged {

  public static void main(String[] args) throws Exception {
    asyncListAssetsPaged();
  }

  public static void asyncListAssetsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      ListAssetsRequest request =
          ListAssetsRequest.newBuilder()
              .setParent("parent-995424086")
              .setReadTime(Timestamp.newBuilder().build())
              .addAllAssetTypes(new ArrayList<String>())
              .setContentType(ContentType.forNumber(0))
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListAssetsResponse response = assetServiceClient.listAssetsCallable().call(request);
        for (Asset element : response.getAssetsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END asset_v1p5beta1_generated_assetserviceclient_listassets_paged_async]
