FROM strimzi/kafka:0.16.0-kafka-2.4.0
ARG CAMEL_KAFKA_CONNECTOR_VERSION
ENV CAMEL_KAFKA_CONNECTOR_VERSION ${CAMEL_KAFKA_CONNECTOR_VERSION:-0.0.1-SNAPSHOT}
USER root:root
COPY ./core/target/camel-kafka-connector-${CAMEL_KAFKA_CONNECTOR_VERSION}-package/share/java/camel-kafka-connector/ /opt/kafka/plugins/camel-kafka-connector/
# COPY ./tests/src/test/resources/log4j2.properties /opt/kafka/custom-config/log4j.properties
RUN mkdir -p /opt/kafka/custom-config/ && touch /opt/kafka/custom-config/log4j.properties
COPY ./examples/ /opt/kafka/custom-config
RUN sed -i 's/localhost/broker/' /opt/kafka/custom-config/CamelJmsSinkConnector.properties
RUN echo -e "\ngroup.id=connect-cluster" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties && \
    echo "offset.storage.topic=connect-offsets" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties && \
    echo "offset.storage.replication.factor=1" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties && \
    echo "config.storage.topic=connect-configs" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties && \
    echo "config.storage.replication.factor=1" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties && \
    echo "status.storage.topic=connect-status" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties && \
    echo "status.storage.replication.factor=1" >> /opt/kafka/custom-config/CamelJmsSinkConnector.properties

CMD KAFKA_CONNECT_CONFIGURATION=$(cat /opt/kafka/custom-config/CamelJmsSinkConnector.properties) /opt/kafka/kafka_connect_run.sh
USER 1001