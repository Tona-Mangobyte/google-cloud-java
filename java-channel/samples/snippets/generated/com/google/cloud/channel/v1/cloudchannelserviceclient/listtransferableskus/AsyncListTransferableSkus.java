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

package com.google.cloud.channel.v1.samples;

// [START channel_v1_generated_cloudchannelserviceclient_listtransferableskus_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.ListTransferableSkusRequest;
import com.google.cloud.channel.v1.TransferableSku;

public class AsyncListTransferableSkus {

  public static void main(String[] args) throws Exception {
    asyncListTransferableSkus();
  }

  public static void asyncListTransferableSkus() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      ListTransferableSkusRequest request =
          ListTransferableSkusRequest.newBuilder()
              .setParent("parent-995424086")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setAuthToken("authToken1450587441")
              .setLanguageCode("languageCode-2092349083")
              .build();
      ApiFuture<TransferableSku> future =
          cloudChannelServiceClient.listTransferableSkusPagedCallable().futureCall(request);
      // Do something.
      for (TransferableSku element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END channel_v1_generated_cloudchannelserviceclient_listtransferableskus_async]
