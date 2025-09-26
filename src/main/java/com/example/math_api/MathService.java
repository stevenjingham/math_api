package com.example.math_api;

import com.example.math_api.exception.InvalidNumberInput;

public class MathService {
    private MathDomain mathDomain;

    public MathService(){
        this.mathDomain = new MathDomain();
    }


    public MathDTO checkPrime(int number) {
        if (number < 1) throw new InvalidNumberInput(number);
        return new MathDTO(number, mathDomain.checkPrime(number));
    }

    public MathDTO getPrimesBelowInputNumber(int number) {
        if (number < 1) throw new InvalidNumberInput(number);
        return new MathDTO(number, mathDomain.checkPrime(number), mathDomain.getPrimesBelowInputNumber(number));
    }
}
