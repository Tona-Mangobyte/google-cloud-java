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

package com.google.cloud.vision.v1p1beta1.samples;

// [START vision_v1p1beta1_generated_imageannotatorsettings_batchannotateimages_sync]
import com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings;
import java.time.Duration;

public class SyncBatchAnnotateImages {

  public static void main(String[] args) throws Exception {
    syncBatchAnnotateImages();
  }

  public static void syncBatchAnnotateImages() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    ImageAnnotatorSettings.Builder imageAnnotatorSettingsBuilder =
        ImageAnnotatorSettings.newBuilder();
    imageAnnotatorSettingsBuilder
        .batchAnnotateImagesSettings()
        .setRetrySettings(
            imageAnnotatorSettingsBuilder
                .batchAnnotateImagesSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    ImageAnnotatorSettings imageAnnotatorSettings = imageAnnotatorSettingsBuilder.build();
  }
}
// [END vision_v1p1beta1_generated_imageannotatorsettings_batchannotateimages_sync]
