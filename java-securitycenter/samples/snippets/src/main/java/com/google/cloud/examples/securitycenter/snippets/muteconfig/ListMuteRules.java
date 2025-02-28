/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.examples.securitycenter.snippets.muteconfig;

// [START securitycenter_list_mute_configs]

import com.google.cloud.securitycenter.v1.ListMuteConfigsRequest;
import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import java.io.IOException;

public class ListMuteRules {

  public static void main(String[] args) {
    // TODO: Replace variables enclosed within {}

    // parent: Use any one of the following resource paths to list mute configurations:
    //         - organizations/{organization_id}
    //         - folders/{folder_id}
    //         - projects/{project_id}
    String parentPath = String.format("projects/%s", "your-google-cloud-project-id");
    listMuteRules(parentPath);
  }

  // Listing mute configs at the organization level will return all the configs
  // at the org, folder, and project levels.
  // Similarly, listing configs at folder level will list all the configs
  // at the folder and project levels.
  public static void listMuteRules(String parent) {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (SecurityCenterClient client = SecurityCenterClient.create()) {

      ListMuteConfigsRequest listMuteConfigsRequest =
          ListMuteConfigsRequest.newBuilder().setParent(parent).build();

      // List all mute configs present in the resource.
      for (MuteConfig muteConfig : client.listMuteConfigs(listMuteConfigsRequest).iterateAll()) {
        System.out.println(muteConfig.getName());
      }
    } catch (IOException e) {
      System.out.println("Listing Mute rule failed! \n Exception: " + e);
    }
  }
}
// [END securitycenter_list_mute_configs]
