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

package com.google.cloud.recaptchaenterprise.v1beta1.samples;

// [START recaptchaenterprise_v1beta1_generated_recaptchaenterpriseservicev1beta1client_createassessment_stringassessment_sync]
import com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Client;
import com.google.recaptchaenterprise.v1beta1.Assessment;
import com.google.recaptchaenterprise.v1beta1.ProjectName;

public class SyncCreateAssessmentStringAssessment {

  public static void main(String[] args) throws Exception {
    syncCreateAssessmentStringAssessment();
  }

  public static void syncCreateAssessmentStringAssessment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client =
        RecaptchaEnterpriseServiceV1Beta1Client.create()) {
      String parent = ProjectName.of("[PROJECT]").toString();
      Assessment assessment = Assessment.newBuilder().build();
      Assessment response =
          recaptchaEnterpriseServiceV1Beta1Client.createAssessment(parent, assessment);
    }
  }
}
// [END recaptchaenterprise_v1beta1_generated_recaptchaenterpriseservicev1beta1client_createassessment_stringassessment_sync]
