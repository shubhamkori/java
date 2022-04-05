package com.mythirdspringproject.thirdspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class thirdController {

    @GetMapping("/helloWorld")
    public String thirdapi(){

        return "message hello shubham";
    }   
}
