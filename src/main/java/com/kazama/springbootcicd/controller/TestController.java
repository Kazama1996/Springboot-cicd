package com.kazama.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/feature1")
    public String feature1() {
        return "I'm feature 1";
    }

    @GetMapping("/feature2")
    public String feature2() {
        return "Hello This is feature 2";
    }

    @GetMapping("/feature4")
    public String feature4() {
        return " Hello This is feature 4 ~~~~";
    }

    @GetMapping("/feature5")
    public String feature5() {
        return " Hello This is feature 5 ~~~~";
    }

}
