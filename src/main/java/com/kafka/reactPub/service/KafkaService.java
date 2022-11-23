package com.kafka.reactPub.service;
import reactor.core.publisher.Mono;

public interface KafkaService {

    Mono<Boolean> send(String topic, String key, Object value);
}