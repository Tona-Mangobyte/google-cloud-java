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

package com.google.cloud.dataproc.v1.stub.samples;

// [START dataproc_v1_generated_workflowtemplateservicestubsettings_createworkflowtemplate_sync]
import com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings;
import java.time.Duration;

public class SyncCreateWorkflowTemplate {

  public static void main(String[] args) throws Exception {
    syncCreateWorkflowTemplate();
  }

  public static void syncCreateWorkflowTemplate() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    WorkflowTemplateServiceStubSettings.Builder workflowTemplateServiceSettingsBuilder =
        WorkflowTemplateServiceStubSettings.newBuilder();
    workflowTemplateServiceSettingsBuilder
        .createWorkflowTemplateSettings()
        .setRetrySettings(
            workflowTemplateServiceSettingsBuilder
                .createWorkflowTemplateSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    WorkflowTemplateServiceStubSettings workflowTemplateServiceSettings =
        workflowTemplateServiceSettingsBuilder.build();
  }
}
// [END dataproc_v1_generated_workflowtemplateservicestubsettings_createworkflowtemplate_sync]
