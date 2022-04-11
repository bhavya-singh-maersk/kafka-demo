package com.maersk.kafkademo.controller;


import com.maersk.kafkademo.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private ProducerService producer;

    @PostMapping(value = "/send/kafka/message")
    public String sendKafkaMessage(@RequestBody String message) {
       // producer.sendMessage(message, "bhavya", "Maersk", "corId");
        producer.sendEvent("jbs", message, "corId");
        return "Success";
    }

    /*@PostMapping(value = "/send/avro/message")
    public String postAvroMessage(@RequestBody String message, @RequestParam String corId) throws JSONException, URISyntaxException, InvalidKeyException, StorageException {
        JSONObject response = new JSONObject(message);
        EventNotificationsAdapterModel avro= EventNotificationsAdapterModel.newBuilder()
                .setResponse(response.get("response").toString())
                .setCorrelationId("corId").setMessageType("xml").setMessageId("dfdf-dfd")
                .setSourceSystem("docbroker").setResponseConsumers(Collections.emptyList()).build();
        producer.sendMessage(avro, corId);
       // producer.sendMessageToKafka(avro, "corId");
        return "Success";
    }

    @PostMapping(value = "/send/json")
    public String postJsonMessage(@RequestBody String message) throws URISyntaxException, InvalidKeyException, StorageException {
        producer.publishMessageToKafka(message, UUID.randomUUID().toString());
        return "Success";
    }

    @PostMapping(value = "/send/avro")
    public String postAvroMessage(@RequestBody String message) throws URISyntaxException, InvalidKeyException, StorageException {
        JSONObject response = new JSONObject(message);
        EventNotificationsAdapterModel avro= EventNotificationsAdapterModel.newBuilder()
                .setResponse(response.get("response").toString())
                .setCorrelationId("corId").setMessageType("xml").setMessageId("dfdf-dfd")
                .setSourceSystem("docbroker").setResponseConsumers(Collections.emptyList()).build();
        producer.sendMessageToKafka(avro, UUID.randomUUID().toString());
        return "Success";
    }

    //@Timed(value = "Ping", description = "Execution Time")
    @CounterMetric
    @GetMapping(value = "/ping")
    public String ping()
    {
        return "Ping successful";
    }*/
}
