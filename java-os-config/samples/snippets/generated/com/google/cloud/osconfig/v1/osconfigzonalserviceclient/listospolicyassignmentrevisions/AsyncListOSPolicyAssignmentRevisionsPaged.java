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

package com.google.cloud.osconfig.v1.samples;

// [START osconfig_v1_generated_osconfigzonalserviceclient_listospolicyassignmentrevisions_paged_async]
import com.google.cloud.osconfig.v1.ListOSPolicyAssignmentRevisionsRequest;
import com.google.cloud.osconfig.v1.ListOSPolicyAssignmentRevisionsResponse;
import com.google.cloud.osconfig.v1.OSPolicyAssignment;
import com.google.cloud.osconfig.v1.OSPolicyAssignmentName;
import com.google.cloud.osconfig.v1.OsConfigZonalServiceClient;
import com.google.common.base.Strings;

public class AsyncListOSPolicyAssignmentRevisionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListOSPolicyAssignmentRevisionsPaged();
  }

  public static void asyncListOSPolicyAssignmentRevisionsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      ListOSPolicyAssignmentRevisionsRequest request =
          ListOSPolicyAssignmentRevisionsRequest.newBuilder()
              .setName(
                  OSPolicyAssignmentName.of("[PROJECT]", "[LOCATION]", "[OS_POLICY_ASSIGNMENT]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListOSPolicyAssignmentRevisionsResponse response =
            osConfigZonalServiceClient.listOSPolicyAssignmentRevisionsCallable().call(request);
        for (OSPolicyAssignment element : response.getOsPolicyAssignmentsList()) {
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
// [END osconfig_v1_generated_osconfigzonalserviceclient_listospolicyassignmentrevisions_paged_async]
