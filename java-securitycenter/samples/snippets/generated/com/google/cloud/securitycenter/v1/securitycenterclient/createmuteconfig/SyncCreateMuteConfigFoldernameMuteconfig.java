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

// [START securitycenter_v1_generated_securitycenterclient_createmuteconfig_foldernamemuteconfig_sync]
import com.google.cloud.securitycenter.v1.FolderName;
import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;

public class SyncCreateMuteConfigFoldernameMuteconfig {

  public static void main(String[] args) throws Exception {
    syncCreateMuteConfigFoldernameMuteconfig();
  }

  public static void syncCreateMuteConfigFoldernameMuteconfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      FolderName parent = FolderName.of("[FOLDER]");
      MuteConfig muteConfig = MuteConfig.newBuilder().build();
      MuteConfig response = securityCenterClient.createMuteConfig(parent, muteConfig);
    }
  }
}
// [END securitycenter_v1_generated_securitycenterclient_createmuteconfig_foldernamemuteconfig_sync]
