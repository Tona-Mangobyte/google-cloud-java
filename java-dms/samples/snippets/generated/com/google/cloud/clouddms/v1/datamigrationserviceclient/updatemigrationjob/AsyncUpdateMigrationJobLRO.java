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

package com.google.cloud.clouddms.v1.samples;

// [START clouddms_v1_generated_datamigrationserviceclient_updatemigrationjob_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.clouddms.v1.DataMigrationServiceClient;
import com.google.cloud.clouddms.v1.MigrationJob;
import com.google.cloud.clouddms.v1.OperationMetadata;
import com.google.cloud.clouddms.v1.UpdateMigrationJobRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateMigrationJobLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateMigrationJobLRO();
  }

  public static void asyncUpdateMigrationJobLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataMigrationServiceClient dataMigrationServiceClient =
        DataMigrationServiceClient.create()) {
      UpdateMigrationJobRequest request =
          UpdateMigrationJobRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setMigrationJob(MigrationJob.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<MigrationJob, OperationMetadata> future =
          dataMigrationServiceClient.updateMigrationJobOperationCallable().futureCall(request);
      // Do something.
      MigrationJob response = future.get();
    }
  }
}
// [END clouddms_v1_generated_datamigrationserviceclient_updatemigrationjob_lro_async]
