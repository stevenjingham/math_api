package com.example.math_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private final MathService mathService;

    public MathController(){
        this.mathService = new MathService();
    }

    @GetMapping("/primeNumber/{number}")
    public String primeNumber(@PathVariable int number){
        return mathService.checkPrime(number);
    }

}
