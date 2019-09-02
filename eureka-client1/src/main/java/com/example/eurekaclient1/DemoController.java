package com.example.eurekaclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringJoiner;

@RestController
public class DemoController {

    @Value("${name}")
    private String applicationName;

    @GetMapping("/hello")
    public String getJson(@RequestParam(name = "param") String name){
        return applicationName + name;
    }
}
