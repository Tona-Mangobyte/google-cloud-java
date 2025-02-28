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

package com.google.cloud.workflows.v1beta.samples;

// [START workflows_v1beta_generated_workflowsclient_createworkflow_locationnameworkflowstring_sync]
import com.google.cloud.workflows.v1beta.LocationName;
import com.google.cloud.workflows.v1beta.Workflow;
import com.google.cloud.workflows.v1beta.WorkflowsClient;

public class SyncCreateWorkflowLocationnameWorkflowString {

  public static void main(String[] args) throws Exception {
    syncCreateWorkflowLocationnameWorkflowString();
  }

  public static void syncCreateWorkflowLocationnameWorkflowString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WorkflowsClient workflowsClient = WorkflowsClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Workflow workflow = Workflow.newBuilder().build();
      String workflowId = "workflowId-360387270";
      Workflow response = workflowsClient.createWorkflowAsync(parent, workflow, workflowId).get();
    }
  }
}
// [END workflows_v1beta_generated_workflowsclient_createworkflow_locationnameworkflowstring_sync]
