FROM strimzi/kafka:0.16.0-kafka-2.4.0
ARG CAMEL_KAFKA_CONNECTOR_VERSION
ENV CAMEL_KAFKA_CONNECTOR_VERSION ${CAMEL_KAFKA_CONNECTOR_VERSION:-0.0.1-SNAPSHOT}
USER root:root
COPY ./core/target/camel-kafka-connector-${CAMEL_KAFKA_CONNECTOR_VERSION}-package/share/java/camel-kafka-connector/ /opt/kafka/plugins/camel-kafka-connector/
COPY ./tests/src/test/resources/log4j2.properties /opt/kafka/custom-config/log4j.properties
COPY ./examples/ /opt/kafka/custom-config
RUN sed -i 's/localhost/broker/' /opt/kafka/custom-config/CamelJmsSinkConnector.properties
CMD KAFKA_CONNECT_CONFIGURATION=$(cat /opt/kafka/custom-config/CamelJmsSinkConnector.properties) /opt/kafka/kafka_connect_run.sh
USER 1001