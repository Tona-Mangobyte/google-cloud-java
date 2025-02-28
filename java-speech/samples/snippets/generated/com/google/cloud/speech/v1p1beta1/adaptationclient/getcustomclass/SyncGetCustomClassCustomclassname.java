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

// [START speech_v1p1beta1_generated_adaptationclient_getcustomclass_customclassname_sync]
import com.google.cloud.speech.v1p1beta1.AdaptationClient;
import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.cloud.speech.v1p1beta1.CustomClassName;

public class SyncGetCustomClassCustomclassname {

  public static void main(String[] args) throws Exception {
    syncGetCustomClassCustomclassname();
  }

  public static void syncGetCustomClassCustomclassname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AdaptationClient adaptationClient = AdaptationClient.create()) {
      CustomClassName name = CustomClassName.of("[PROJECT]", "[LOCATION]", "[CUSTOM_CLASS]");
      CustomClass response = adaptationClient.getCustomClass(name);
    }
  }
}
// [END speech_v1p1beta1_generated_adaptationclient_getcustomclass_customclassname_sync]
