package com.java.engineering.micrometerprometheusspringboot.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {

    @Timed(
        value = "HelloController.hello.request",
        histogram = true,
        extraTags = {"version", "1.0"}
    )
    @GetMapping("/hello")
    public String hello() {
        return "Hello Java Engineers";
    }
}
