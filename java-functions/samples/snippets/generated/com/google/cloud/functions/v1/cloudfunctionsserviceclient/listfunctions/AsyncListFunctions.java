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

package com.google.cloud.functions.v1.samples;

// [START functions_v1_generated_cloudfunctionsserviceclient_listfunctions_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.functions.v1.CloudFunction;
import com.google.cloud.functions.v1.CloudFunctionsServiceClient;
import com.google.cloud.functions.v1.ListFunctionsRequest;
import com.google.cloud.functions.v1.LocationName;

public class AsyncListFunctions {

  public static void main(String[] args) throws Exception {
    asyncListFunctions();
  }

  public static void asyncListFunctions() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
        CloudFunctionsServiceClient.create()) {
      ListFunctionsRequest request =
          ListFunctionsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<CloudFunction> future =
          cloudFunctionsServiceClient.listFunctionsPagedCallable().futureCall(request);
      // Do something.
      for (CloudFunction element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END functions_v1_generated_cloudfunctionsserviceclient_listfunctions_async]
