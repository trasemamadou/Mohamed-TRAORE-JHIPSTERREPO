package com.tom.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/")
public class  SayHelloController {
@Autowired
    private RestTemplate restTemplate;
    @GetMapping("hello")
    public ResponseEntity<String> ms1SayHello(){
        return ResponseEntity.ok("MS1 is saying hello in MS1");
    }
    @GetMapping("helloms2")
    public ResponseEntity<String> ms2SayHello(){
        String url = "http://localhost:9002/api/v1/hello";
        try
        {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return ResponseEntity.ok(response.getBody());
        }
        catch (Exception e){
            return ResponseEntity.status(500).body("Error"+ e.getMessage());
        }
    }
}

