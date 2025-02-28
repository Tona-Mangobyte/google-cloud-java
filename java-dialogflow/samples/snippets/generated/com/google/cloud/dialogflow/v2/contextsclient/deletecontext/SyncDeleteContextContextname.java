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

// [START dialogflow_v2_generated_contextsclient_deletecontext_contextname_sync]
import com.google.cloud.dialogflow.v2.ContextName;
import com.google.cloud.dialogflow.v2.ContextsClient;
import com.google.protobuf.Empty;

public class SyncDeleteContextContextname {

  public static void main(String[] args) throws Exception {
    syncDeleteContextContextname();
  }

  public static void syncDeleteContextContextname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ContextsClient contextsClient = ContextsClient.create()) {
      ContextName name =
          ContextName.ofProjectSessionContextName("[PROJECT]", "[SESSION]", "[CONTEXT]");
      contextsClient.deleteContext(name);
    }
  }
}
// [END dialogflow_v2_generated_contextsclient_deletecontext_contextname_sync]
