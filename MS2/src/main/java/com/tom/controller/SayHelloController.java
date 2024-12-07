package com.tom.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SayHelloController {
    @RequestMapping("hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("MS2 is saying hello");
    }
}
