package com.example.springrestexample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

//author: Pattabhi
@RestController
@RequestMapping("/hello")
public class HelloResourceController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/json", produces = APPLICATION_JSON_VALUE)
    public Hello helloJson() {
        return new Hello("Greetings", "Hello World");
    }
}
