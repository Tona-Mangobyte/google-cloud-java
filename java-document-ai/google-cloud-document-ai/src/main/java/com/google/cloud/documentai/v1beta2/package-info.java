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

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= DocumentUnderstandingServiceClient =======================
 *
 * <p>Service Description: Service to parse structured information from unstructured or
 * semi-structured documents using state-of-the-art Google AI such as natural language, computer
 * vision, and translation.
 *
 * <p>Sample for DocumentUnderstandingServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (DocumentUnderstandingServiceClient documentUnderstandingServiceClient =
 *     DocumentUnderstandingServiceClient.create()) {
 *   ProcessDocumentRequest request =
 *       ProcessDocumentRequest.newBuilder()
 *           .setParent("parent-995424086")
 *           .setInputConfig(InputConfig.newBuilder().build())
 *           .setOutputConfig(OutputConfig.newBuilder().build())
 *           .setDocumentType("documentType-1473196299")
 *           .setTableExtractionParams(TableExtractionParams.newBuilder().build())
 *           .setFormExtractionParams(FormExtractionParams.newBuilder().build())
 *           .setEntityExtractionParams(EntityExtractionParams.newBuilder().build())
 *           .setOcrParams(OcrParams.newBuilder().build())
 *           .setAutomlParams(AutoMlParams.newBuilder().build())
 *           .build();
 *   Document response = documentUnderstandingServiceClient.processDocument(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.documentai.v1beta2;

import javax.annotation.Generated;
