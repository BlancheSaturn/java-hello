package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class HelloController {
@Autowired
HelloRepository helloRepository;


    @GetMapping("/hello")
    public ResponseEntity<List<Hello>> getGreeting() {
        return ResponseEntity.status(HttpStatus.OK).body(helloRepository.findAll());

    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Guten Tag. Wie geht es dir? Ma name is Blanche. ";
    }
}

