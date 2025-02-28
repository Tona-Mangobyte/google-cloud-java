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

package com.google.cloud.documentai.v1beta3.samples;

// [START documentai_v1beta3_generated_documentprocessorserviceclient_listprocessors_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1beta3.ListProcessorsRequest;
import com.google.cloud.documentai.v1beta3.LocationName;
import com.google.cloud.documentai.v1beta3.Processor;

public class AsyncListProcessors {

  public static void main(String[] args) throws Exception {
    asyncListProcessors();
  }

  public static void asyncListProcessors() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      ListProcessorsRequest request =
          ListProcessorsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Processor> future =
          documentProcessorServiceClient.listProcessorsPagedCallable().futureCall(request);
      // Do something.
      for (Processor element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END documentai_v1beta3_generated_documentprocessorserviceclient_listprocessors_async]
