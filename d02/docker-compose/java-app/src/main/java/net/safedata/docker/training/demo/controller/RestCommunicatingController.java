package net.safedata.docker.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCommunicatingController {

    private final RestTemplate restTemplate;

    @Value("${nodejs.application.port}")
    private String nodejsApplicationPort;

    @Autowired
    public RestCommunicatingController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String localHello() {
        return "Hello from the Spring Boot app!";
    }

    @GetMapping("/hello-from-node")
    public String helloFromNode() {
        return restTemplate.getForObject("http://localhost:" + nodejsApplicationPort, String.class);
    }
}
