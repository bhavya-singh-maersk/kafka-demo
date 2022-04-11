package com.maersk.kafkademo.service;

public interface ProducerService {

    void sendMessage(String message, String userId, String tenantId, String corId);

    void sendEvent(String event, String message, String docBrokerCorId);
}
