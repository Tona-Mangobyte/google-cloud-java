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

package com.google.cloud.domains.v1.samples;

// [START domains_v1_generated_domainsclient_configurecontactsettings_stringcontactsettingsfieldmask_sync]
import com.google.cloud.domains.v1.ContactSettings;
import com.google.cloud.domains.v1.DomainsClient;
import com.google.cloud.domains.v1.Registration;
import com.google.cloud.domains.v1.RegistrationName;
import com.google.protobuf.FieldMask;

public class SyncConfigureContactSettingsStringContactsettingsFieldmask {

  public static void main(String[] args) throws Exception {
    syncConfigureContactSettingsStringContactsettingsFieldmask();
  }

  public static void syncConfigureContactSettingsStringContactsettingsFieldmask() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      String registration =
          RegistrationName.of("[PROJECT]", "[LOCATION]", "[REGISTRATION]").toString();
      ContactSettings contactSettings = ContactSettings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      Registration response =
          domainsClient
              .configureContactSettingsAsync(registration, contactSettings, updateMask)
              .get();
    }
  }
}
// [END domains_v1_generated_domainsclient_configurecontactsettings_stringcontactsettingsfieldmask_sync]
