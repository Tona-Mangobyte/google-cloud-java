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

package com.google.cloud.securitycenter.v1.samples;

// [START securitycenter_v1_generated_securitycenterclient_bulkmutefindings_sync]
import com.google.cloud.securitycenter.v1.BulkMuteFindingsRequest;
import com.google.cloud.securitycenter.v1.BulkMuteFindingsResponse;
import com.google.cloud.securitycenter.v1.FolderName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;

public class SyncBulkMuteFindings {

  public static void main(String[] args) throws Exception {
    syncBulkMuteFindings();
  }

  public static void syncBulkMuteFindings() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      BulkMuteFindingsRequest request =
          BulkMuteFindingsRequest.newBuilder()
              .setParent(FolderName.of("[FOLDER]").toString())
              .setFilter("filter-1274492040")
              .setMuteAnnotation("muteAnnotation-2111042008")
              .build();
      BulkMuteFindingsResponse response = securityCenterClient.bulkMuteFindingsAsync(request).get();
    }
  }
}
// [END securitycenter_v1_generated_securitycenterclient_bulkmutefindings_sync]
