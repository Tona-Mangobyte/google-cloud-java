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

// [START resourcemanager_v3_generated_projectsclient_listprojects_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.resourcemanager.v3.FolderName;
import com.google.cloud.resourcemanager.v3.ListProjectsRequest;
import com.google.cloud.resourcemanager.v3.Project;
import com.google.cloud.resourcemanager.v3.ProjectsClient;

public class AsyncListProjects {

  public static void main(String[] args) throws Exception {
    asyncListProjects();
  }

  public static void asyncListProjects() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProjectsClient projectsClient = ProjectsClient.create()) {
      ListProjectsRequest request =
          ListProjectsRequest.newBuilder()
              .setParent(FolderName.of("[FOLDER]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .setShowDeleted(true)
              .build();
      ApiFuture<Project> future = projectsClient.listProjectsPagedCallable().futureCall(request);
      // Do something.
      for (Project element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END resourcemanager_v3_generated_projectsclient_listprojects_async]
