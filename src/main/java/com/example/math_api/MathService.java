package com.example.math_api;

import com.example.math_api.Exception.InvalidNumberInput;

public class MathService {
    private MathDomain mathDomain;

    public MathService(){
        this.mathDomain = new MathDomain();
    }


    public String checkPrime(int number) {
        if (number < 1) throw new InvalidNumberInput(number);
        return number + " is a prime: " + mathDomain.checkPrime(number);
    }
}
