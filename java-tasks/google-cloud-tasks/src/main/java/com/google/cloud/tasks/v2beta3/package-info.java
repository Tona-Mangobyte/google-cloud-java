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
 * <p>======================= CloudTasksClient =======================
 *
 * <p>Service Description: Cloud Tasks allows developers to manage the execution of background work
 * in their applications.
 *
 * <p>Sample for CloudTasksClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (CloudTasksClient cloudTasksClient = CloudTasksClient.create()) {
 *   QueueName name = QueueName.of("[PROJECT]", "[LOCATION]", "[QUEUE]");
 *   Queue response = cloudTasksClient.getQueue(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.tasks.v2beta3;

import javax.annotation.Generated;
