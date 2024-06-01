package com.javaservices.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/message")
    public String getMessage() {
        return "Message from Service B";
    }

}
