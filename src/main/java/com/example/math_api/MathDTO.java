package com.example.math_api;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Objects;

@Getter
@Setter
public class MathDTO {

    private int number;
    private boolean isPrime;
    private ArrayList primes;

    public MathDTO(int number, boolean isPrime){
        this.number = number;
        this.isPrime = isPrime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MathDTO mathDTO = (MathDTO) o;
        return number == mathDTO.number && isPrime == mathDTO.isPrime && Objects.equals(primes, mathDTO.primes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, isPrime, primes);
    }

    public MathDTO(int number, boolean isPrime, ArrayList<Integer> primesBelowInputNumber) {
        this.number = number;
        this.isPrime = isPrime;
        this.primes = primesBelowInputNumber;
    }


}

