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

package com.google.cloud.dataproc.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStub;
import com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The API interface for managing Workflow Templates in the Dataproc API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
 *     WorkflowTemplateServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
 *   WorkflowTemplate response =
 *       workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the WorkflowTemplateServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * WorkflowTemplateServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
 *     WorkflowTemplateServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * WorkflowTemplateServiceClient workflowTemplateServiceClient =
 *     WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
 *     WorkflowTemplateServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * WorkflowTemplateServiceClient workflowTemplateServiceClient =
 *     WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
 *     WorkflowTemplateServiceSettings.newBuilder()
 *         .setTransportChannelProvider(
 *             WorkflowTemplateServiceSettings.defaultHttpJsonTransportProviderBuilder().build())
 *         .build();
 * WorkflowTemplateServiceClient workflowTemplateServiceClient =
 *     WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class WorkflowTemplateServiceClient implements BackgroundResource {
  private final WorkflowTemplateServiceSettings settings;
  private final WorkflowTemplateServiceStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of WorkflowTemplateServiceClient with default settings. */
  public static final WorkflowTemplateServiceClient create() throws IOException {
    return create(WorkflowTemplateServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of WorkflowTemplateServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final WorkflowTemplateServiceClient create(WorkflowTemplateServiceSettings settings)
      throws IOException {
    return new WorkflowTemplateServiceClient(settings);
  }

  /**
   * Constructs an instance of WorkflowTemplateServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(WorkflowTemplateServiceSettings).
   */
  public static final WorkflowTemplateServiceClient create(WorkflowTemplateServiceStub stub) {
    return new WorkflowTemplateServiceClient(stub);
  }

  /**
   * Constructs an instance of WorkflowTemplateServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected WorkflowTemplateServiceClient(WorkflowTemplateServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((WorkflowTemplateServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected WorkflowTemplateServiceClient(WorkflowTemplateServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final WorkflowTemplateServiceSettings getSettings() {
    return settings;
  }

  public WorkflowTemplateServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response =
   *       workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.create`, the resource name of the region has
   *           the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.create`, the resource name of the location
   *           has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @param template Required. The Dataproc workflow template to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(
      LocationName parent, WorkflowTemplate template) {
    CreateWorkflowTemplateRequest request =
        CreateWorkflowTemplateRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTemplate(template)
            .build();
    return createWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response =
   *       workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.create`, the resource name of the region has
   *           the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.create`, the resource name of the location
   *           has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @param template Required. The Dataproc workflow template to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(
      RegionName parent, WorkflowTemplate template) {
    CreateWorkflowTemplateRequest request =
        CreateWorkflowTemplateRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTemplate(template)
            .build();
    return createWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String parent = RegionName.of("[PROJECT]", "[REGION]").toString();
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response =
   *       workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.create`, the resource name of the region has
   *           the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.create`, the resource name of the location
   *           has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @param template Required. The Dataproc workflow template to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(String parent, WorkflowTemplate template) {
    CreateWorkflowTemplateRequest request =
        CreateWorkflowTemplateRequest.newBuilder().setParent(parent).setTemplate(template).build();
    return createWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   CreateWorkflowTemplateRequest request =
   *       CreateWorkflowTemplateRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(CreateWorkflowTemplateRequest request) {
    return createWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   CreateWorkflowTemplateRequest request =
   *       CreateWorkflowTemplateRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .build();
   *   ApiFuture<WorkflowTemplate> future =
   *       workflowTemplateServiceClient.createWorkflowTemplateCallable().futureCall(request);
   *   // Do something.
   *   WorkflowTemplate response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateWorkflowTemplateRequest, WorkflowTemplate>
      createWorkflowTemplateCallable() {
    return stub.createWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name =
   *       WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *           "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
   *   WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.get`, the resource name of the template has
   *           the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.get`, the resource name of the template has
   *           the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate getWorkflowTemplate(WorkflowTemplateName name) {
    GetWorkflowTemplateRequest request =
        GetWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String name =
   *       WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
   *               "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
   *           .toString();
   *   WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.get`, the resource name of the template has
   *           the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.get`, the resource name of the template has
   *           the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate getWorkflowTemplate(String name) {
    GetWorkflowTemplateRequest request =
        GetWorkflowTemplateRequest.newBuilder().setName(name).build();
    return getWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   GetWorkflowTemplateRequest request =
   *       GetWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate getWorkflowTemplate(GetWorkflowTemplateRequest request) {
    return getWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   GetWorkflowTemplateRequest request =
   *       GetWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .build();
   *   ApiFuture<WorkflowTemplate> future =
   *       workflowTemplateServiceClient.getWorkflowTemplateCallable().futureCall(request);
   *   // Do something.
   *   WorkflowTemplate response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetWorkflowTemplateRequest, WorkflowTemplate>
      getWorkflowTemplateCallable() {
    return stub.getWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name =
   *       WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *           "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      WorkflowTemplateName name) {
    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String name =
   *       WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
   *               "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
   *           .toString();
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      String name) {
    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder().setName(name).build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name =
   *       WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *           "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
   *   Map<String, String> parameters = new HashMap<>();
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name, parameters).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @param parameters Optional. Map from parameter names to values that should be used for those
   *     parameters. Values may not exceed 1000 characters.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      WorkflowTemplateName name, Map<String, String> parameters) {
    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .putAllParameters(parameters)
            .build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String name =
   *       WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
   *               "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
   *           .toString();
   *   Map<String, String> parameters = new HashMap<>();
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name, parameters).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @param parameters Optional. Map from parameter names to values that should be used for those
   *     parameters. Values may not exceed 1000 characters.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      String name, Map<String, String> parameters) {
    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder()
            .setName(name)
            .putAllParameters(parameters)
            .build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   InstantiateWorkflowTemplateRequest request =
   *       InstantiateWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .setRequestId("requestId693933066")
   *           .putAllParameters(new HashMap<String, String>())
   *           .build();
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      InstantiateWorkflowTemplateRequest request) {
    return instantiateWorkflowTemplateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   InstantiateWorkflowTemplateRequest request =
   *       InstantiateWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .setRequestId("requestId693933066")
   *           .putAllParameters(new HashMap<String, String>())
   *           .build();
   *   OperationFuture<Empty, WorkflowMetadata> future =
   *       workflowTemplateServiceClient
   *           .instantiateWorkflowTemplateOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InstantiateWorkflowTemplateRequest, Empty, WorkflowMetadata>
      instantiateWorkflowTemplateOperationCallable() {
    return stub.instantiateWorkflowTemplateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   InstantiateWorkflowTemplateRequest request =
   *       InstantiateWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .setRequestId("requestId693933066")
   *           .putAllParameters(new HashMap<String, String>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       workflowTemplateServiceClient.instantiateWorkflowTemplateCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InstantiateWorkflowTemplateRequest, Operation>
      instantiateWorkflowTemplateCallable() {
    return stub.instantiateWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(parent, template).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates,instantiateinline`, the resource name of the
   *           region has the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiateinline`, the resource name of
   *           the location has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @param template Required. The workflow template to instantiate.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      LocationName parent, WorkflowTemplate template) {
    InstantiateInlineWorkflowTemplateRequest request =
        InstantiateInlineWorkflowTemplateRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTemplate(template)
            .build();
    return instantiateInlineWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(parent, template).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates,instantiateinline`, the resource name of the
   *           region has the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiateinline`, the resource name of
   *           the location has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @param template Required. The workflow template to instantiate.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      RegionName parent, WorkflowTemplate template) {
    InstantiateInlineWorkflowTemplateRequest request =
        InstantiateInlineWorkflowTemplateRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTemplate(template)
            .build();
    return instantiateInlineWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String parent = RegionName.of("[PROJECT]", "[REGION]").toString();
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(parent, template).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates,instantiateinline`, the resource name of the
   *           region has the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiateinline`, the resource name of
   *           the location has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @param template Required. The workflow template to instantiate.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      String parent, WorkflowTemplate template) {
    InstantiateInlineWorkflowTemplateRequest request =
        InstantiateInlineWorkflowTemplateRequest.newBuilder()
            .setParent(parent)
            .setTemplate(template)
            .build();
    return instantiateInlineWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   InstantiateInlineWorkflowTemplateRequest request =
   *       InstantiateInlineWorkflowTemplateRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      InstantiateInlineWorkflowTemplateRequest request) {
    return instantiateInlineWorkflowTemplateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   InstantiateInlineWorkflowTemplateRequest request =
   *       InstantiateInlineWorkflowTemplateRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, WorkflowMetadata> future =
   *       workflowTemplateServiceClient
   *           .instantiateInlineWorkflowTemplateOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InstantiateInlineWorkflowTemplateRequest, Empty, WorkflowMetadata>
      instantiateInlineWorkflowTemplateOperationCallable() {
    return stub.instantiateInlineWorkflowTemplateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata).
   * Also see [Using
   * WorkflowMetadata](https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   InstantiateInlineWorkflowTemplateRequest request =
   *       InstantiateInlineWorkflowTemplateRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       workflowTemplateServiceClient
   *           .instantiateInlineWorkflowTemplateCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InstantiateInlineWorkflowTemplateRequest, Operation>
      instantiateInlineWorkflowTemplateCallable() {
    return stub.instantiateInlineWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates (replaces) workflow template. The updated template must contain version that matches
   * the current server version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.updateWorkflowTemplate(template);
   * }
   * }</pre>
   *
   * @param template Required. The updated workflow template.
   *     <p>The `template.version` field must match the current version.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate updateWorkflowTemplate(WorkflowTemplate template) {
    UpdateWorkflowTemplateRequest request =
        UpdateWorkflowTemplateRequest.newBuilder().setTemplate(template).build();
    return updateWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates (replaces) workflow template. The updated template must contain version that matches
   * the current server version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   UpdateWorkflowTemplateRequest request =
   *       UpdateWorkflowTemplateRequest.newBuilder()
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.updateWorkflowTemplate(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate updateWorkflowTemplate(UpdateWorkflowTemplateRequest request) {
    return updateWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates (replaces) workflow template. The updated template must contain version that matches
   * the current server version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   UpdateWorkflowTemplateRequest request =
   *       UpdateWorkflowTemplateRequest.newBuilder()
   *           .setTemplate(WorkflowTemplate.newBuilder().build())
   *           .build();
   *   ApiFuture<WorkflowTemplate> future =
   *       workflowTemplateServiceClient.updateWorkflowTemplateCallable().futureCall(request);
   *   // Do something.
   *   WorkflowTemplate response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateWorkflowTemplateRequest, WorkflowTemplate>
      updateWorkflowTemplateCallable() {
    return stub.updateWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (WorkflowTemplate element :
   *       workflowTemplateServiceClient.listWorkflowTemplates(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates,list`, the resource name of the region has
   *           the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.list`, the resource name of the location
   *           has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(LocationName parent) {
    ListWorkflowTemplatesRequest request =
        ListWorkflowTemplatesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listWorkflowTemplates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   for (WorkflowTemplate element :
   *       workflowTemplateServiceClient.listWorkflowTemplates(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates,list`, the resource name of the region has
   *           the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.list`, the resource name of the location
   *           has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(RegionName parent) {
    ListWorkflowTemplatesRequest request =
        ListWorkflowTemplatesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listWorkflowTemplates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String parent = RegionName.of("[PROJECT]", "[REGION]").toString();
   *   for (WorkflowTemplate element :
   *       workflowTemplateServiceClient.listWorkflowTemplates(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the region or location, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates,list`, the resource name of the region has
   *           the following format: `projects/{project_id}/regions/{region}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.list`, the resource name of the location
   *           has the following format: `projects/{project_id}/locations/{location}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(String parent) {
    ListWorkflowTemplatesRequest request =
        ListWorkflowTemplatesRequest.newBuilder().setParent(parent).build();
    return listWorkflowTemplates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   ListWorkflowTemplatesRequest request =
   *       ListWorkflowTemplatesRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (WorkflowTemplate element :
   *       workflowTemplateServiceClient.listWorkflowTemplates(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(
      ListWorkflowTemplatesRequest request) {
    return listWorkflowTemplatesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   ListWorkflowTemplatesRequest request =
   *       ListWorkflowTemplatesRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<WorkflowTemplate> future =
   *       workflowTemplateServiceClient.listWorkflowTemplatesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (WorkflowTemplate element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListWorkflowTemplatesRequest, ListWorkflowTemplatesPagedResponse>
      listWorkflowTemplatesPagedCallable() {
    return stub.listWorkflowTemplatesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   ListWorkflowTemplatesRequest request =
   *       ListWorkflowTemplatesRequest.newBuilder()
   *           .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListWorkflowTemplatesResponse response =
   *         workflowTemplateServiceClient.listWorkflowTemplatesCallable().call(request);
   *     for (WorkflowTemplate element : response.getTemplatesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse>
      listWorkflowTemplatesCallable() {
    return stub.listWorkflowTemplatesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name =
   *       WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *           "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]");
   *   workflowTemplateServiceClient.deleteWorkflowTemplate(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.delete`, the resource name of the template
   *           has the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteWorkflowTemplate(WorkflowTemplateName name) {
    DeleteWorkflowTemplateRequest request =
        DeleteWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   String name =
   *       WorkflowTemplateName.ofProjectRegionWorkflowTemplateName(
   *               "[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]")
   *           .toString();
   *   workflowTemplateServiceClient.deleteWorkflowTemplate(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names.
   *     <ul>
   *       <li>For `projects.regions.workflowTemplates.delete`, the resource name of the template
   *           has the following format:
   *           `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *     </ul>
   *     <ul>
   *       <li>For `projects.locations.workflowTemplates.instantiate`, the resource name of the
   *           template has the following format:
   *           `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteWorkflowTemplate(String name) {
    DeleteWorkflowTemplateRequest request =
        DeleteWorkflowTemplateRequest.newBuilder().setName(name).build();
    deleteWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   DeleteWorkflowTemplateRequest request =
   *       DeleteWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .build();
   *   workflowTemplateServiceClient.deleteWorkflowTemplate(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteWorkflowTemplate(DeleteWorkflowTemplateRequest request) {
    deleteWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
   *     WorkflowTemplateServiceClient.create()) {
   *   DeleteWorkflowTemplateRequest request =
   *       DeleteWorkflowTemplateRequest.newBuilder()
   *           .setName(
   *               WorkflowTemplateName.ofProjectLocationWorkflowTemplateName(
   *                       "[PROJECT]", "[LOCATION]", "[WORKFLOW_TEMPLATE]")
   *                   .toString())
   *           .setVersion(351608024)
   *           .build();
   *   ApiFuture<Empty> future =
   *       workflowTemplateServiceClient.deleteWorkflowTemplateCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteWorkflowTemplateRequest, Empty>
      deleteWorkflowTemplateCallable() {
    return stub.deleteWorkflowTemplateCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListWorkflowTemplatesPagedResponse
      extends AbstractPagedListResponse<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          WorkflowTemplate,
          ListWorkflowTemplatesPage,
          ListWorkflowTemplatesFixedSizeCollection> {

    public static ApiFuture<ListWorkflowTemplatesPagedResponse> createAsync(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ApiFuture<ListWorkflowTemplatesResponse> futureResponse) {
      ApiFuture<ListWorkflowTemplatesPage> futurePage =
          ListWorkflowTemplatesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListWorkflowTemplatesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListWorkflowTemplatesPagedResponse(ListWorkflowTemplatesPage page) {
      super(page, ListWorkflowTemplatesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListWorkflowTemplatesPage
      extends AbstractPage<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          WorkflowTemplate,
          ListWorkflowTemplatesPage> {

    private ListWorkflowTemplatesPage(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ListWorkflowTemplatesResponse response) {
      super(context, response);
    }

    private static ListWorkflowTemplatesPage createEmptyPage() {
      return new ListWorkflowTemplatesPage(null, null);
    }

    @Override
    protected ListWorkflowTemplatesPage createPage(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ListWorkflowTemplatesResponse response) {
      return new ListWorkflowTemplatesPage(context, response);
    }

    @Override
    public ApiFuture<ListWorkflowTemplatesPage> createPageAsync(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ApiFuture<ListWorkflowTemplatesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListWorkflowTemplatesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          WorkflowTemplate,
          ListWorkflowTemplatesPage,
          ListWorkflowTemplatesFixedSizeCollection> {

    private ListWorkflowTemplatesFixedSizeCollection(
        List<ListWorkflowTemplatesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListWorkflowTemplatesFixedSizeCollection createEmptyCollection() {
      return new ListWorkflowTemplatesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListWorkflowTemplatesFixedSizeCollection createCollection(
        List<ListWorkflowTemplatesPage> pages, int collectionSize) {
      return new ListWorkflowTemplatesFixedSizeCollection(pages, collectionSize);
    }
  }
}
