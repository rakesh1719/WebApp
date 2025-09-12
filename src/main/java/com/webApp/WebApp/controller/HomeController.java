package com.webApp.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //returning only the data not the page
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody //returning only the data not the page
    public String greet(){
        return "Welcome!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello Guys";
    }
}
