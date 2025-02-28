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

// [START automl_v1beta1_generated_predictionserviceclient_batchpredict_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.automl.v1beta1.BatchPredictInputConfig;
import com.google.cloud.automl.v1beta1.BatchPredictOutputConfig;
import com.google.cloud.automl.v1beta1.BatchPredictRequest;
import com.google.cloud.automl.v1beta1.BatchPredictResult;
import com.google.cloud.automl.v1beta1.ModelName;
import com.google.cloud.automl.v1beta1.OperationMetadata;
import com.google.cloud.automl.v1beta1.PredictionServiceClient;
import java.util.HashMap;

public class AsyncBatchPredictLRO {

  public static void main(String[] args) throws Exception {
    asyncBatchPredictLRO();
  }

  public static void asyncBatchPredictLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
      BatchPredictRequest request =
          BatchPredictRequest.newBuilder()
              .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
              .setInputConfig(BatchPredictInputConfig.newBuilder().build())
              .setOutputConfig(BatchPredictOutputConfig.newBuilder().build())
              .putAllParams(new HashMap<String, String>())
              .build();
      OperationFuture<BatchPredictResult, OperationMetadata> future =
          predictionServiceClient.batchPredictOperationCallable().futureCall(request);
      // Do something.
      BatchPredictResult response = future.get();
    }
  }
}
// [END automl_v1beta1_generated_predictionserviceclient_batchpredict_lro_async]
