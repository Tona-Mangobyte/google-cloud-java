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

package com.google.cloud.speech.v1.samples;

// [START speech_v1_generated_adaptationclient_listcustomclasses_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.speech.v1.AdaptationClient;
import com.google.cloud.speech.v1.CustomClass;
import com.google.cloud.speech.v1.ListCustomClassesRequest;
import com.google.cloud.speech.v1.LocationName;

public class AsyncListCustomClasses {

  public static void main(String[] args) throws Exception {
    asyncListCustomClasses();
  }

  public static void asyncListCustomClasses() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AdaptationClient adaptationClient = AdaptationClient.create()) {
      ListCustomClassesRequest request =
          ListCustomClassesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<CustomClass> future =
          adaptationClient.listCustomClassesPagedCallable().futureCall(request);
      // Do something.
      for (CustomClass element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END speech_v1_generated_adaptationclient_listcustomclasses_async]
