package com.example.randomsum.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomController {

    private final Random random = new Random();

    @GetMapping("/sum")
    public int getRandomSum() {
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        return a + b;
    }
}