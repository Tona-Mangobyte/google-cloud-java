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

package com.google.cloud.iot.v1.samples;

// [START iot_v1_generated_devicemanagerclient_createdeviceregistry_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.iot.v1.CreateDeviceRegistryRequest;
import com.google.cloud.iot.v1.DeviceManagerClient;
import com.google.cloud.iot.v1.DeviceRegistry;
import com.google.cloud.iot.v1.LocationName;

public class AsyncCreateDeviceRegistry {

  public static void main(String[] args) throws Exception {
    asyncCreateDeviceRegistry();
  }

  public static void asyncCreateDeviceRegistry() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DeviceManagerClient deviceManagerClient = DeviceManagerClient.create()) {
      CreateDeviceRegistryRequest request =
          CreateDeviceRegistryRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setDeviceRegistry(DeviceRegistry.newBuilder().build())
              .build();
      ApiFuture<DeviceRegistry> future =
          deviceManagerClient.createDeviceRegistryCallable().futureCall(request);
      // Do something.
      DeviceRegistry response = future.get();
    }
  }
}
// [END iot_v1_generated_devicemanagerclient_createdeviceregistry_async]
