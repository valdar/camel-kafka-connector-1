/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.infinispanembedded;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelInfinispanembeddedSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_PATH_CACHE_NAME_CONF = "camel.source.path.cacheName";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_PATH_CACHE_NAME_DOC = "The name of the cache to use. Use current to use the existing cache name from the currently configured cached manager. Or use default for the default cache manager name.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_PATH_CACHE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_CONF = "camel.source.endpoint.queryBuilder";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DOC = "Specifies the query builder.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CLUSTERED_LISTENER_CONF = "camel.source.endpoint.clusteredListener";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CLUSTERED_LISTENER_DOC = "If true, the listener will be installed for the entire cluster";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CLUSTERED_LISTENER_DEFAULT = false;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CUSTOM_LISTENER_CONF = "camel.source.endpoint.customListener";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CUSTOM_LISTENER_DOC = "Returns the custom listener in use, if provided";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CUSTOM_LISTENER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EVENT_TYPES_CONF = "camel.source.endpoint.eventTypes";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EVENT_TYPES_DOC = "Specifies the set of event types to register by the consumer.Multiple event can be separated by comma. The possible event types are: CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED, CACHE_ENTRY_VISITED, CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED, CACHE_ENTRY_CREATED, CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED, TRANSACTION_COMPLETED, TRANSACTION_REGISTERED, CACHE_ENTRY_INVALIDATED, CACHE_ENTRY_EXPIRED, DATA_REHASHED, TOPOLOGY_CHANGED, PARTITION_STATUS_CHANGED, PERSISTENCE_AVAILABILITY_CHANGED";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EVENT_TYPES_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_SYNC_CONF = "camel.source.endpoint.sync";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_SYNC_DOC = "If true, the consumer will receive notifications synchronously";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_SYNC_DEFAULT = true;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONF = "camel.source.endpoint.cacheContainer";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DOC = "Specifies the cache Container to connect";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_CONF = "camel.source.endpoint.cacheContainerConfiguration";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DOC = "The CacheContainer configuration. Used if the cacheContainer is not defined.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_CONF = "camel.source.endpoint.configurationUri";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DOC = "An implementation specific URI for the CacheManager";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_FLAGS_CONF = "camel.source.endpoint.flags";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DOC = "A comma separated list of org.infinispan.context.Flag to be applied by default on each cache invocation";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_CONF = "camel.source.endpoint.remappingFunction";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DOC = "Set a specific remappingFunction to use in a compute operation.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_CONF = "camel.source.endpoint.resultHeader";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DOC = "Store the operation result in a header instead of the message body. By default, resultHeader == null and the query result is stored in the message body, any existing content in the message body is discarded. If resultHeader is set, the value is used as the name of the header to store the query result and the original message body is preserved. This value can be overridden by an in message header named: CamelInfinispanOperationResultHeader";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_CONF = "camel.component.infinispan-embedded.configuration";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_CONF = "camel.component.infinispan-embedded.queryBuilder";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DOC = "Specifies the query builder.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.infinispan-embedded.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CLUSTERED_LISTENER_CONF = "camel.component.infinispan-embedded.clusteredListener";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CLUSTERED_LISTENER_DOC = "If true, the listener will be installed for the entire cluster";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CLUSTERED_LISTENER_DEFAULT = false;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CUSTOM_LISTENER_CONF = "camel.component.infinispan-embedded.customListener";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CUSTOM_LISTENER_DOC = "Returns the custom listener in use, if provided";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CUSTOM_LISTENER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_EVENT_TYPES_CONF = "camel.component.infinispan-embedded.eventTypes";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_EVENT_TYPES_DOC = "Specifies the set of event types to register by the consumer.Multiple event can be separated by comma. The possible event types are: CACHE_ENTRY_ACTIVATED, CACHE_ENTRY_PASSIVATED, CACHE_ENTRY_VISITED, CACHE_ENTRY_LOADED, CACHE_ENTRY_EVICTED, CACHE_ENTRY_CREATED, CACHE_ENTRY_REMOVED, CACHE_ENTRY_MODIFIED, TRANSACTION_COMPLETED, TRANSACTION_REGISTERED, CACHE_ENTRY_INVALIDATED, CACHE_ENTRY_EXPIRED, DATA_REHASHED, TOPOLOGY_CHANGED, PARTITION_STATUS_CHANGED, PERSISTENCE_AVAILABILITY_CHANGED";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_EVENT_TYPES_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_SYNC_CONF = "camel.component.infinispan-embedded.sync";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_SYNC_DOC = "If true, the consumer will receive notifications synchronously";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_SYNC_DEFAULT = true;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.infinispan-embedded.autowiredEnabled";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONF = "camel.component.infinispan-embedded.cacheContainer";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DOC = "Specifies the cache Container to connect";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_CONF = "camel.component.infinispan-embedded.cacheContainerConfiguration";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DOC = "The CacheContainer configuration. Used if the cacheContainer is not defined.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_CONF = "camel.component.infinispan-embedded.configurationUri";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DOC = "An implementation specific URI for the CacheManager";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_FLAGS_CONF = "camel.component.infinispan-embedded.flags";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_FLAGS_DOC = "A comma separated list of org.infinispan.context.Flag to be applied by default on each cache invocation";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_FLAGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_CONF = "camel.component.infinispan-embedded.remappingFunction";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DOC = "Set a specific remappingFunction to use in a compute operation.";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_CONF = "camel.component.infinispan-embedded.resultHeader";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DOC = "Store the operation result in a header instead of the message body. By default, resultHeader == null and the query result is stored in the message body, any existing content in the message body is discarded. If resultHeader is set, the value is used as the name of the header to store the query result and the original message body is preserved. This value can be overridden by an in message header named: CamelInfinispanOperationResultHeader";
    public static final String CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DEFAULT = null;

    public CamelInfinispanembeddedSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelInfinispanembeddedSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_PATH_CACHE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_PATH_CACHE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_INFINISPANEMBEDDED_PATH_CACHE_NAME_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CLUSTERED_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CLUSTERED_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CLUSTERED_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CUSTOM_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CUSTOM_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CUSTOM_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EVENT_TYPES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EVENT_TYPES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EVENT_TYPES_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_SYNC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_SYNC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_SYNC_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_FLAGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CLUSTERED_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CLUSTERED_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CLUSTERED_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CUSTOM_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CUSTOM_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CUSTOM_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_EVENT_TYPES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_EVENT_TYPES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_EVENT_TYPES_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_SYNC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_SYNC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_SYNC_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_FLAGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_FLAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_FLAGS_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DOC);
        conf.define(CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DOC);
        return conf;
    }
}