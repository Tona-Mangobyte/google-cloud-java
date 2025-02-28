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

package com.google.cloud.speech.v1p1beta1.samples;

// [START speech_v1p1beta1_generated_adaptationclient_createcustomclass_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.speech.v1p1beta1.AdaptationClient;
import com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.cloud.speech.v1p1beta1.LocationName;

public class AsyncCreateCustomClass {

  public static void main(String[] args) throws Exception {
    asyncCreateCustomClass();
  }

  public static void asyncCreateCustomClass() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AdaptationClient adaptationClient = AdaptationClient.create()) {
      CreateCustomClassRequest request =
          CreateCustomClassRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setCustomClassId("customClassId1871032322")
              .setCustomClass(CustomClass.newBuilder().build())
              .build();
      ApiFuture<CustomClass> future =
          adaptationClient.createCustomClassCallable().futureCall(request);
      // Do something.
      CustomClass response = future.get();
    }
  }
}
// [END speech_v1p1beta1_generated_adaptationclient_createcustomclass_async]
