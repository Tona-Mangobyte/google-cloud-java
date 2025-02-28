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
 * <p>======================= WebRiskServiceClient =======================
 *
 * <p>Service Description: Web Risk API defines an interface to detect malicious URLs on your
 * website and in client applications.
 *
 * <p>Sample for WebRiskServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (WebRiskServiceClient webRiskServiceClient = WebRiskServiceClient.create()) {
 *   ThreatType threatType = ThreatType.forNumber(0);
 *   ByteString versionToken = ByteString.EMPTY;
 *   ComputeThreatListDiffRequest.Constraints constraints =
 *       ComputeThreatListDiffRequest.Constraints.newBuilder().build();
 *   ComputeThreatListDiffResponse response =
 *       webRiskServiceClient.computeThreatListDiff(threatType, versionToken, constraints);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.webrisk.v1;

import javax.annotation.Generated;
