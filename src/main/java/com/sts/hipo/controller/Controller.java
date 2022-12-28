package com.sts.hipo.controller;

import com.sts.hipo.service.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@AllArgsConstructor
@RequestMapping("/api")
public class Controller {

    private final ServiceImpl service;

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>(service.helloWorld(), HttpStatus.OK);
    }
}