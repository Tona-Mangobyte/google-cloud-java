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

// [START workflows_v1beta_generated_workflowsclient_getworkflow_sync]
import com.google.cloud.workflows.v1beta.GetWorkflowRequest;
import com.google.cloud.workflows.v1beta.Workflow;
import com.google.cloud.workflows.v1beta.WorkflowName;
import com.google.cloud.workflows.v1beta.WorkflowsClient;

public class SyncGetWorkflow {

  public static void main(String[] args) throws Exception {
    syncGetWorkflow();
  }

  public static void syncGetWorkflow() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WorkflowsClient workflowsClient = WorkflowsClient.create()) {
      GetWorkflowRequest request =
          GetWorkflowRequest.newBuilder()
              .setName(WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]").toString())
              .build();
      Workflow response = workflowsClient.getWorkflow(request);
    }
  }
}
// [END workflows_v1beta_generated_workflowsclient_getworkflow_sync]
