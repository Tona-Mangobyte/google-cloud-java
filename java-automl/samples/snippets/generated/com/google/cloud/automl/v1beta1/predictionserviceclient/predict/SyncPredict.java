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

package com.google.cloud.automl.v1beta1.samples;

// [START automl_v1beta1_generated_predictionserviceclient_predict_sync]
import com.google.cloud.automl.v1beta1.ExamplePayload;
import com.google.cloud.automl.v1beta1.ModelName;
import com.google.cloud.automl.v1beta1.PredictRequest;
import com.google.cloud.automl.v1beta1.PredictResponse;
import com.google.cloud.automl.v1beta1.PredictionServiceClient;
import java.util.HashMap;

public class SyncPredict {

  public static void main(String[] args) throws Exception {
    syncPredict();
  }

  public static void syncPredict() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
      PredictRequest request =
          PredictRequest.newBuilder()
              .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
              .setPayload(ExamplePayload.newBuilder().build())
              .putAllParams(new HashMap<String, String>())
              .build();
      PredictResponse response = predictionServiceClient.predict(request);
    }
  }
}
// [END automl_v1beta1_generated_predictionserviceclient_predict_sync]
