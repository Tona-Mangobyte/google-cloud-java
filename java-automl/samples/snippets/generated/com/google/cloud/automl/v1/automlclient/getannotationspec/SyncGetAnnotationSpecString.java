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

package com.google.cloud.automl.v1.samples;

// [START automl_v1_generated_automlclient_getannotationspec_string_sync]
import com.google.cloud.automl.v1.AnnotationSpec;
import com.google.cloud.automl.v1.AnnotationSpecName;
import com.google.cloud.automl.v1.AutoMlClient;

public class SyncGetAnnotationSpecString {

  public static void main(String[] args) throws Exception {
    syncGetAnnotationSpecString();
  }

  public static void syncGetAnnotationSpecString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AutoMlClient autoMlClient = AutoMlClient.create()) {
      String name =
          AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]")
              .toString();
      AnnotationSpec response = autoMlClient.getAnnotationSpec(name);
    }
  }
}
// [END automl_v1_generated_automlclient_getannotationspec_string_sync]
