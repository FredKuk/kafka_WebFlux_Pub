package com.kafka.reactPub.service;
import reactor.core.publisher.Mono;

public interface MessageService {

    Mono<String> send(String key, Object value);

    // Flux<ServerSentEvent<Object>> receive();

}