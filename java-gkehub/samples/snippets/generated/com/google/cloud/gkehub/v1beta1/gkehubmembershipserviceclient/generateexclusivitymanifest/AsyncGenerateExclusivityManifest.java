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

package com.google.cloud.gkehub.v1beta1.samples;

// [START gkehub_v1beta1_generated_gkehubmembershipserviceclient_generateexclusivitymanifest_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestRequest;
import com.google.cloud.gkehub.v1beta1.GenerateExclusivityManifestResponse;
import com.google.cloud.gkehub.v1beta1.GkeHubMembershipServiceClient;
import com.google.cloud.gkehub.v1beta1.MembershipName;

public class AsyncGenerateExclusivityManifest {

  public static void main(String[] args) throws Exception {
    asyncGenerateExclusivityManifest();
  }

  public static void asyncGenerateExclusivityManifest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GkeHubMembershipServiceClient gkeHubMembershipServiceClient =
        GkeHubMembershipServiceClient.create()) {
      GenerateExclusivityManifestRequest request =
          GenerateExclusivityManifestRequest.newBuilder()
              .setName(MembershipName.of("[PROJECT]", "[LOCATION]", "[MEMBERSHIP]").toString())
              .setCrdManifest("crdManifest1401188132")
              .setCrManifest("crManifest-1971077186")
              .build();
      ApiFuture<GenerateExclusivityManifestResponse> future =
          gkeHubMembershipServiceClient.generateExclusivityManifestCallable().futureCall(request);
      // Do something.
      GenerateExclusivityManifestResponse response = future.get();
    }
  }
}
// [END gkehub_v1beta1_generated_gkehubmembershipserviceclient_generateexclusivitymanifest_async]
