package com.security.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping()
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to Spring EcoSystem, a Secured EndPoint !");
    }
}
