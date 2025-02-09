package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app")
public class MyController {

    @GetMapping
    public void getData(){
        System.out.println("Get the data");
    }

    @PostMapping
    public void saveData(){
        System.out.println("Save the data");
    }
}
