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

package com.google.cloud.documentai.v1.samples;

// [START documentai_v1_generated_documentprocessorserviceclient_enableprocessor_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.documentai.v1.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1.EnableProcessorMetadata;
import com.google.cloud.documentai.v1.EnableProcessorRequest;
import com.google.cloud.documentai.v1.EnableProcessorResponse;
import com.google.cloud.documentai.v1.ProcessorName;

public class AsyncEnableProcessorLRO {

  public static void main(String[] args) throws Exception {
    asyncEnableProcessorLRO();
  }

  public static void asyncEnableProcessorLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      EnableProcessorRequest request =
          EnableProcessorRequest.newBuilder()
              .setName(ProcessorName.of("[PROJECT]", "[LOCATION]", "[PROCESSOR]").toString())
              .build();
      OperationFuture<EnableProcessorResponse, EnableProcessorMetadata> future =
          documentProcessorServiceClient.enableProcessorOperationCallable().futureCall(request);
      // Do something.
      EnableProcessorResponse response = future.get();
    }
  }
}
// [END documentai_v1_generated_documentprocessorserviceclient_enableprocessor_lro_async]
