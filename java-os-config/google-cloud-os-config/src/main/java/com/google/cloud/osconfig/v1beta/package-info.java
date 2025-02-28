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

/**
 * A client to OS Config API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= OsConfigServiceClient =======================
 *
 * <p>Service Description: OS Config API
 *
 * <p>The OS Config service is a server-side component that you can use to manage package
 * installations and patch jobs for virtual machine instances.
 *
 * <p>Sample for OsConfigServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (OsConfigServiceClient osConfigServiceClient = OsConfigServiceClient.create()) {
 *   PatchJobs.ExecutePatchJobRequest request =
 *       PatchJobs.ExecutePatchJobRequest.newBuilder()
 *           .setParent("parent-995424086")
 *           .setDescription("description-1724546052")
 *           .setInstanceFilter(PatchJobs.PatchInstanceFilter.newBuilder().build())
 *           .setPatchConfig(PatchJobs.PatchConfig.newBuilder().build())
 *           .setDuration(Duration.newBuilder().build())
 *           .setDryRun(true)
 *           .setDisplayName("displayName1714148973")
 *           .setRollout(PatchJobs.PatchRollout.newBuilder().build())
 *           .build();
 *   PatchJobs.PatchJob response = osConfigServiceClient.executePatchJob(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.osconfig.v1beta;

import javax.annotation.Generated;
