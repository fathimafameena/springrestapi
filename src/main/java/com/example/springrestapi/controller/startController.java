package com.example.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fameena")
public class startController {

    @GetMapping(value = "/{name}")
    public String fetchapplication(@PathVariable String name) {

        System.out.println("the main application but little bit changed " + name);
        System.out.println("i am added in the feature");
        System.out.println("i am from github edit");
        return name;


    }


}
