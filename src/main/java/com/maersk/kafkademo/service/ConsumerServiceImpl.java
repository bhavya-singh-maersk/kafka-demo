package com.maersk.kafkademo.service;

//import com.maersk.producer.consumer.library.kafka.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Service
public class ConsumerServiceImpl <T> implements ConsumerService{
    @Override
    public void listenMessage() {

    }

    /*@Autowired
    private KafkaConsumer <T> kafkaConsumer;

    @Override
    //@EventListener(ApplicationStartedEvent.class)
    public void listenMessage() {
        kafkaConsumer.runConsumer();
    }*/
}
