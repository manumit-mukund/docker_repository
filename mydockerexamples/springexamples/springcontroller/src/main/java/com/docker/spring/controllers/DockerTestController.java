package com.docker.spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/docker")

public class DockerTestController {

    @RequestMapping("/getvalues")
    public Map<String, Object> getValues() {

        Map<String, Object> mapObject = new LinkedHashMap<>();
        mapObject.put("Docker message:", "Spring Boot for Docker");
        mapObject.put("Languages:", Arrays.asList("Java", "C", "C++", "Python"));
        mapObject.put("Code:", 123);

        return mapObject;
    }

}
