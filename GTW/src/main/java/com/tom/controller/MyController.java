package com.tom.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class MyController {
    @GetMapping("hello")
    public ResponseEntity<String> SayHello(){
        return ResponseEntity.ok("Im saying hello!!");
    }
}
