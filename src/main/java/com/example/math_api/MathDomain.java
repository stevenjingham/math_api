package com.example.math_api;

import java.util.ArrayList;

public class MathDomain {
    public boolean checkPrime(int number) {

        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getPrimesBelowInputNumber(int number) {
        ArrayList<Integer> primes = new ArrayList();
        for (int i = 0; i<= number; i++){
            if (checkPrime(i)==true) primes.add(i);
        }
        System.out.println(primes);
        return primes;
    }
}
