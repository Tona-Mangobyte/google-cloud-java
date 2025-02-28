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

package com.google.cloud.security.privateca.v1beta1.samples;

// [START privateca_v1beta1_generated_certificateauthorityserviceclient_getcertificaterevocationlist_sync]
import com.google.cloud.security.privateca.v1beta1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1beta1.CertificateRevocationList;
import com.google.cloud.security.privateca.v1beta1.CertificateRevocationListName;
import com.google.cloud.security.privateca.v1beta1.GetCertificateRevocationListRequest;

public class SyncGetCertificateRevocationList {

  public static void main(String[] args) throws Exception {
    syncGetCertificateRevocationList();
  }

  public static void syncGetCertificateRevocationList() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      GetCertificateRevocationListRequest request =
          GetCertificateRevocationListRequest.newBuilder()
              .setName(
                  CertificateRevocationListName.of(
                          "[PROJECT]",
                          "[LOCATION]",
                          "[CERTIFICATE_AUTHORITY]",
                          "[CERTIFICATE_REVOCATION_LIST]")
                      .toString())
              .build();
      CertificateRevocationList response =
          certificateAuthorityServiceClient.getCertificateRevocationList(request);
    }
  }
}
// [END privateca_v1beta1_generated_certificateauthorityserviceclient_getcertificaterevocationlist_sync]
