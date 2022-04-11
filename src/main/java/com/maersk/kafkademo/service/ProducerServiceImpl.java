package com.maersk.kafkademo.service;

import com.maersk.producer.consumer.library.annotations.EventProducer;
import com.maersk.producer.consumer.library.annotations.Produce;
import com.maersk.producer.consumer.library.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl <T> implements ProducerService {

    @Autowired
    private KafkaProducer<T> kafkaProducer;

    @Override
    @Produce
    public void sendMessage(String message ,String userId, String tenantId, String corId) {

    }

    @Override
    @EventProducer
    public void sendEvent(String event, String message, String docBrokerCorId) {

    }

}
