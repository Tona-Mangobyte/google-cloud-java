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

package com.google.cloud.securitycenter.v1beta1.samples;

// [START securitycenter_v1beta1_generated_securitycenterclient_updatesecuritymarks_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.v1beta1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1beta1.SecurityMarks;
import com.google.cloud.securitycenter.v1beta1.UpdateSecurityMarksRequest;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;

public class AsyncUpdateSecurityMarks {

  public static void main(String[] args) throws Exception {
    asyncUpdateSecurityMarks();
  }

  public static void asyncUpdateSecurityMarks() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(SecurityMarks.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setStartTime(Timestamp.newBuilder().build())
              .build();
      ApiFuture<SecurityMarks> future =
          securityCenterClient.updateSecurityMarksCallable().futureCall(request);
      // Do something.
      SecurityMarks response = future.get();
    }
  }
}
// [END securitycenter_v1beta1_generated_securitycenterclient_updatesecuritymarks_async]
