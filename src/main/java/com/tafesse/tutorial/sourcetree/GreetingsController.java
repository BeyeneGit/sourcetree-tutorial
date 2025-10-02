package com.tafesse.tutorial.sourcetree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class GreetingsController {
    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to GreetingsController";
    }
}
