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

package com.google.cloud.recommender.v1.samples;

// [START recommender_v1_generated_recommenderclient_getrecommendation_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.recommender.v1.GetRecommendationRequest;
import com.google.cloud.recommender.v1.Recommendation;
import com.google.cloud.recommender.v1.RecommendationName;
import com.google.cloud.recommender.v1.RecommenderClient;

public class AsyncGetRecommendation {

  public static void main(String[] args) throws Exception {
    asyncGetRecommendation();
  }

  public static void asyncGetRecommendation() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecommenderClient recommenderClient = RecommenderClient.create()) {
      GetRecommendationRequest request =
          GetRecommendationRequest.newBuilder()
              .setName(
                  RecommendationName.ofProjectLocationRecommenderRecommendationName(
                          "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
                      .toString())
              .build();
      ApiFuture<Recommendation> future =
          recommenderClient.getRecommendationCallable().futureCall(request);
      // Do something.
      Recommendation response = future.get();
    }
  }
}
// [END recommender_v1_generated_recommenderclient_getrecommendation_async]
