package com.kazama.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/feature1")
    public String feature1() {
        return "I'm feature update 1";
    }

    @GetMapping("/feature2")
    public String feature2() {
        return "Hello This is feature 2";
    }

}
