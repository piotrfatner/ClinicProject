package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(value = "/asd", method = RequestMethod.GET)
    public String helloMethod(){
        return "Hello from the other side!";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginMethod(){
        return "Hello from the other side!";
    }
}
