package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String home(){
        System.out.println("Hello Guyz");
        return "home";
    }
    @RequestMapping("/contact")
    public String contact(){
        System.out.println("Hey Guyz");
        return "contact";
    }


}
