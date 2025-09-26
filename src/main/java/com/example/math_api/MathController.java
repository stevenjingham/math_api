package com.example.math_api;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private final MathService mathService;

    public MathController(){
        this.mathService = new MathService();
    }

    @GetMapping(path = "/primeNumber/{number}", produces = "application/json")
    public ResponseEntity<MathDTO> primeNumber(@PathVariable int number){
        return ResponseEntity.ok(mathService.checkPrime(number));
    }

    @GetMapping(path = "/getPrimesBelowInputNumber/{number}", produces = "application/json")
    public ResponseEntity<MathDTO> getPrimesBelowInput(@PathVariable int number){
        return ResponseEntity.ok(mathService.getPrimesBelowInputNumber(number));
    }

}
