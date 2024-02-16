package com.api.RandomNameAPI.services;

import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class RandomNameService {
    public String[] names = {"Ayush", "Nikhil", "Gaurav", "Harshil", "Somesh"};
    Random random = new Random();
    public String getRandomName() {
        int getRandomIndex = random.nextInt(names.length);
        return names[getRandomIndex];

    }
}