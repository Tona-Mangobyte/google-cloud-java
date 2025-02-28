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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_sessionentitytypesclient_listsessionentitytypes_sessionname_sync]
import com.google.cloud.dialogflow.v2.SessionEntityType;
import com.google.cloud.dialogflow.v2.SessionEntityTypesClient;
import com.google.cloud.dialogflow.v2.SessionName;

public class SyncListSessionEntityTypesSessionname {

  public static void main(String[] args) throws Exception {
    syncListSessionEntityTypesSessionname();
  }

  public static void syncListSessionEntityTypesSessionname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
      SessionName parent = SessionName.ofProjectSessionName("[PROJECT]", "[SESSION]");
      for (SessionEntityType element :
          sessionEntityTypesClient.listSessionEntityTypes(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v2_generated_sessionentitytypesclient_listsessionentitytypes_sessionname_sync]
