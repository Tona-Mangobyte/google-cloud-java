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

package com.google.cloud.notebooks.v1.samples;

// [START notebooks_v1_generated_managednotebookserviceclient_stopruntime_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.notebooks.v1.ManagedNotebookServiceClient;
import com.google.cloud.notebooks.v1.StopRuntimeRequest;
import com.google.longrunning.Operation;

public class AsyncStopRuntime {

  public static void main(String[] args) throws Exception {
    asyncStopRuntime();
  }

  public static void asyncStopRuntime() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ManagedNotebookServiceClient managedNotebookServiceClient =
        ManagedNotebookServiceClient.create()) {
      StopRuntimeRequest request =
          StopRuntimeRequest.newBuilder()
              .setName("name3373707")
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          managedNotebookServiceClient.stopRuntimeCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END notebooks_v1_generated_managednotebookserviceclient_stopruntime_async]
