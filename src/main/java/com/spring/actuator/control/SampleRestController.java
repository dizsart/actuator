package com.spring.actuator.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @GetMapping
    public String sample() {
        return "Hello sample endpoint";
    }
}
