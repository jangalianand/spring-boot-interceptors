package com.javacodeex.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @GetMapping
    public String getProduct(){

        log.info("getProduct()");
        return "product information";
    }
}
