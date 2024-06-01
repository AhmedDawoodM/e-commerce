package com.javaservices.servicea;

import com.javaservices.servicea.webClient.ServiceAClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ServiceAController {

    private final ServiceAClient service;

    public ServiceAController(ServiceAClient service) {
        this.service = service;
    }

    @GetMapping("/call-serviceB")
    public Mono<String> callServiceB() {
        return service.callServiceB();
    }


}
