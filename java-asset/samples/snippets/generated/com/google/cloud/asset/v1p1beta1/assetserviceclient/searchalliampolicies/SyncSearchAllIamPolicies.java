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

package com.google.cloud.asset.v1p1beta1.samples;

// [START asset_v1p1beta1_generated_assetserviceclient_searchalliampolicies_sync]
import com.google.cloud.asset.v1p1beta1.AssetServiceClient;
import com.google.cloud.asset.v1p1beta1.IamPolicySearchResult;
import com.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest;

public class SyncSearchAllIamPolicies {

  public static void main(String[] args) throws Exception {
    syncSearchAllIamPolicies();
  }

  public static void syncSearchAllIamPolicies() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      SearchAllIamPoliciesRequest request =
          SearchAllIamPoliciesRequest.newBuilder()
              .setScope("scope109264468")
              .setQuery("query107944136")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (IamPolicySearchResult element :
          assetServiceClient.searchAllIamPolicies(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END asset_v1p1beta1_generated_assetserviceclient_searchalliampolicies_sync]
