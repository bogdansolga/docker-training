package net.safedata.docker.training.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFromDockerController {

    @GetMapping("/hello")
    public String helloFromDocker() {
        return "Hello from a Docker container!";
    }
}
