package com.artragazzi.spring_security_api.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/public")
    public ResponseEntity<String>publicRoute(){
        return ResponseEntity.ok("Public Route OK!");
    }


    @GetMapping("/private")
    public ResponseEntity<String>privateRoute(){
        return ResponseEntity.ok("Private Route OK!");
    }


}
