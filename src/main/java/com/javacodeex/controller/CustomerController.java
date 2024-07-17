package com.javacodeex.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController {

    @GetMapping
    public String getMessage(){
        log.info("getMessage()");
        return "welcomoe to the interceptors session";
    }
}
