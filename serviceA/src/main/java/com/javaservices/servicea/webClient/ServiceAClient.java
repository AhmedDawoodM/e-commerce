package com.javaservices.servicea.webClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServiceAClient {
    private final WebClient.Builder webClientBuilder;

    @Autowired
    public ServiceAClient(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Mono<String> callServiceB() {
        return webClientBuilder.build()
                .get()
                .uri("http://serviceB/message")
                .retrieve()
                .bodyToMono(String.class);
    }
}
