package com.docker.spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/docker")

public class DockerController {

    @RequestMapping("/hello")
    public Map<String, String> helloWorld() {

        Map<String, String> mapDockerData = new LinkedHashMap<>();

        mapDockerData.put("Docker message:", "Hello World from Spring MicroService!");       

        return mapDockerData;

        // Test url: http://localhost:9001/docker/hello
    }

}
