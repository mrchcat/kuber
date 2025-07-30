package com.github.mrchcat.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class EchoController {
    private final int id = new SecureRandom().nextInt(1000) + 1;

    @GetMapping("/echo/{request}")
    String echo(@PathVariable("request") String request) {
        return "echo: \"" + request + "\" from id=" + id;
    }

}
