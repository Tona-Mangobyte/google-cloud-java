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

package com.google.cloud.functions.v2.samples;

// [START functions_v2_generated_functionserviceclient_createfunction_sync]
import com.google.cloud.functions.v2.CreateFunctionRequest;
import com.google.cloud.functions.v2.Function;
import com.google.cloud.functions.v2.FunctionServiceClient;
import com.google.cloud.functions.v2.LocationName;

public class SyncCreateFunction {

  public static void main(String[] args) throws Exception {
    syncCreateFunction();
  }

  public static void syncCreateFunction() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (FunctionServiceClient functionServiceClient = FunctionServiceClient.create()) {
      CreateFunctionRequest request =
          CreateFunctionRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setFunction(Function.newBuilder().build())
              .setFunctionId("functionId-62789869")
              .build();
      Function response = functionServiceClient.createFunctionAsync(request).get();
    }
  }
}
// [END functions_v2_generated_functionserviceclient_createfunction_sync]
