package com.maersk.kafkademo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

@Slf4j
@Component
public class KafkaConsumer <T> {

    @KafkaListener(topics = "eacloud", groupId = "test-kafka")
    public void readMessage(ConsumerRecord<String, T> consumerRecord, Acknowledgment acknowledgment)
    {
       if (Objects.nonNull(consumerRecord) && Objects.nonNull(consumerRecord.value()))
       {
           log.info("Received message: {}", consumerRecord.value());
           consumerRecord.headers().forEach(header -> log.info("Kafka header: {}", new String(header.value(), StandardCharsets.UTF_8)));
       }
       throw new RuntimeException("test retry mechanism");
       //acknowledgment.acknowledge();
    }
}
