package com.testApp.firstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get_page")
public class HelloApi {
    @GetMapping
    public String hello(){
        return "Get ile veri gönderimi!";
    }
}
