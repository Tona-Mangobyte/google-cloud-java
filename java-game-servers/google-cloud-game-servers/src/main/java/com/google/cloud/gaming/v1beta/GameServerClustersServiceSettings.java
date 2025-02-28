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

package com.google.cloud.gaming.v1beta;

import static com.google.cloud.gaming.v1beta.GameServerClustersServiceClient.ListGameServerClustersPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.gaming.v1beta.stub.GameServerClustersServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GameServerClustersServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (gameservices.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getGameServerCluster to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * GameServerClustersServiceSettings.Builder gameServerClustersServiceSettingsBuilder =
 *     GameServerClustersServiceSettings.newBuilder();
 * gameServerClustersServiceSettingsBuilder
 *     .getGameServerClusterSettings()
 *     .setRetrySettings(
 *         gameServerClustersServiceSettingsBuilder
 *             .getGameServerClusterSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * GameServerClustersServiceSettings gameServerClustersServiceSettings =
 *     gameServerClustersServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GameServerClustersServiceSettings
    extends ClientSettings<GameServerClustersServiceSettings> {

  /** Returns the object with the settings used for calls to listGameServerClusters. */
  public PagedCallSettings<
          ListGameServerClustersRequest,
          ListGameServerClustersResponse,
          ListGameServerClustersPagedResponse>
      listGameServerClustersSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .listGameServerClustersSettings();
  }

  /** Returns the object with the settings used for calls to getGameServerCluster. */
  public UnaryCallSettings<GetGameServerClusterRequest, GameServerCluster>
      getGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .getGameServerClusterSettings();
  }

  /** Returns the object with the settings used for calls to createGameServerCluster. */
  public UnaryCallSettings<CreateGameServerClusterRequest, Operation>
      createGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .createGameServerClusterSettings();
  }

  /** Returns the object with the settings used for calls to createGameServerCluster. */
  public OperationCallSettings<CreateGameServerClusterRequest, GameServerCluster, OperationMetadata>
      createGameServerClusterOperationSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .createGameServerClusterOperationSettings();
  }

  /** Returns the object with the settings used for calls to previewCreateGameServerCluster. */
  public UnaryCallSettings<
          PreviewCreateGameServerClusterRequest, PreviewCreateGameServerClusterResponse>
      previewCreateGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .previewCreateGameServerClusterSettings();
  }

  /** Returns the object with the settings used for calls to deleteGameServerCluster. */
  public UnaryCallSettings<DeleteGameServerClusterRequest, Operation>
      deleteGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .deleteGameServerClusterSettings();
  }

  /** Returns the object with the settings used for calls to deleteGameServerCluster. */
  public OperationCallSettings<DeleteGameServerClusterRequest, Empty, OperationMetadata>
      deleteGameServerClusterOperationSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .deleteGameServerClusterOperationSettings();
  }

  /** Returns the object with the settings used for calls to previewDeleteGameServerCluster. */
  public UnaryCallSettings<
          PreviewDeleteGameServerClusterRequest, PreviewDeleteGameServerClusterResponse>
      previewDeleteGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .previewDeleteGameServerClusterSettings();
  }

  /** Returns the object with the settings used for calls to updateGameServerCluster. */
  public UnaryCallSettings<UpdateGameServerClusterRequest, Operation>
      updateGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .updateGameServerClusterSettings();
  }

  /** Returns the object with the settings used for calls to updateGameServerCluster. */
  public OperationCallSettings<UpdateGameServerClusterRequest, GameServerCluster, OperationMetadata>
      updateGameServerClusterOperationSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .updateGameServerClusterOperationSettings();
  }

  /** Returns the object with the settings used for calls to previewUpdateGameServerCluster. */
  public UnaryCallSettings<
          PreviewUpdateGameServerClusterRequest, PreviewUpdateGameServerClusterResponse>
      previewUpdateGameServerClusterSettings() {
    return ((GameServerClustersServiceStubSettings) getStubSettings())
        .previewUpdateGameServerClusterSettings();
  }

  public static final GameServerClustersServiceSettings create(
      GameServerClustersServiceStubSettings stub) throws IOException {
    return new GameServerClustersServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return GameServerClustersServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return GameServerClustersServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return GameServerClustersServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GameServerClustersServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return GameServerClustersServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return GameServerClustersServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return GameServerClustersServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GameServerClustersServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  @BetaApi
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected GameServerClustersServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for GameServerClustersServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<GameServerClustersServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(GameServerClustersServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(GameServerClustersServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(GameServerClustersServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(GameServerClustersServiceStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(GameServerClustersServiceStubSettings.newHttpJsonBuilder());
    }

    public GameServerClustersServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((GameServerClustersServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listGameServerClusters. */
    public PagedCallSettings.Builder<
            ListGameServerClustersRequest,
            ListGameServerClustersResponse,
            ListGameServerClustersPagedResponse>
        listGameServerClustersSettings() {
      return getStubSettingsBuilder().listGameServerClustersSettings();
    }

    /** Returns the builder for the settings used for calls to getGameServerCluster. */
    public UnaryCallSettings.Builder<GetGameServerClusterRequest, GameServerCluster>
        getGameServerClusterSettings() {
      return getStubSettingsBuilder().getGameServerClusterSettings();
    }

    /** Returns the builder for the settings used for calls to createGameServerCluster. */
    public UnaryCallSettings.Builder<CreateGameServerClusterRequest, Operation>
        createGameServerClusterSettings() {
      return getStubSettingsBuilder().createGameServerClusterSettings();
    }

    /** Returns the builder for the settings used for calls to createGameServerCluster. */
    public OperationCallSettings.Builder<
            CreateGameServerClusterRequest, GameServerCluster, OperationMetadata>
        createGameServerClusterOperationSettings() {
      return getStubSettingsBuilder().createGameServerClusterOperationSettings();
    }

    /** Returns the builder for the settings used for calls to previewCreateGameServerCluster. */
    public UnaryCallSettings.Builder<
            PreviewCreateGameServerClusterRequest, PreviewCreateGameServerClusterResponse>
        previewCreateGameServerClusterSettings() {
      return getStubSettingsBuilder().previewCreateGameServerClusterSettings();
    }

    /** Returns the builder for the settings used for calls to deleteGameServerCluster. */
    public UnaryCallSettings.Builder<DeleteGameServerClusterRequest, Operation>
        deleteGameServerClusterSettings() {
      return getStubSettingsBuilder().deleteGameServerClusterSettings();
    }

    /** Returns the builder for the settings used for calls to deleteGameServerCluster. */
    public OperationCallSettings.Builder<DeleteGameServerClusterRequest, Empty, OperationMetadata>
        deleteGameServerClusterOperationSettings() {
      return getStubSettingsBuilder().deleteGameServerClusterOperationSettings();
    }

    /** Returns the builder for the settings used for calls to previewDeleteGameServerCluster. */
    public UnaryCallSettings.Builder<
            PreviewDeleteGameServerClusterRequest, PreviewDeleteGameServerClusterResponse>
        previewDeleteGameServerClusterSettings() {
      return getStubSettingsBuilder().previewDeleteGameServerClusterSettings();
    }

    /** Returns the builder for the settings used for calls to updateGameServerCluster. */
    public UnaryCallSettings.Builder<UpdateGameServerClusterRequest, Operation>
        updateGameServerClusterSettings() {
      return getStubSettingsBuilder().updateGameServerClusterSettings();
    }

    /** Returns the builder for the settings used for calls to updateGameServerCluster. */
    public OperationCallSettings.Builder<
            UpdateGameServerClusterRequest, GameServerCluster, OperationMetadata>
        updateGameServerClusterOperationSettings() {
      return getStubSettingsBuilder().updateGameServerClusterOperationSettings();
    }

    /** Returns the builder for the settings used for calls to previewUpdateGameServerCluster. */
    public UnaryCallSettings.Builder<
            PreviewUpdateGameServerClusterRequest, PreviewUpdateGameServerClusterResponse>
        previewUpdateGameServerClusterSettings() {
      return getStubSettingsBuilder().previewUpdateGameServerClusterSettings();
    }

    @Override
    public GameServerClustersServiceSettings build() throws IOException {
      return new GameServerClustersServiceSettings(this);
    }
  }
}
