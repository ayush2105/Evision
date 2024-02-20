package com.api.RandomNameAPI.controllers;

import com.api.RandomNameAPI.services.RandomNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RandomNameController {
//    public String[] names={"Ayush","Nikhil","Gaurav","Harshil","Somesh"};
//    Random random=new Random();
    @Autowired
    private RandomNameService randomNameService;

    @GetMapping("/randomName")
    public String getRandomName(){
        return randomNameService.getRandomName();
    }

}
