package com.example.math_api;

import com.example.math_api.Exception.InvalidNumberInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathServiceTest {
    private final MathService mathService;


    public MathServiceTest() {
        this.mathService = new MathService();
    }

    @Test
    public void checkPrime_throwsExceptionForZero(){
        assertThrows(InvalidNumberInput.class, () -> mathService.checkPrime(0));
    }

    @Test
    public void checkPrime_returnsTrueForPrimes(){
        int[] primes = {2,3,5,37,127};
        for (int i: primes) {
            assertEquals(i + " is a prime: true", mathService.checkPrime(i));
        }
    }

    @Test
    public void checkPrime_returnsFalseForNonPrimes(){
        int[] primes = {4,10,25,64};
        for (int i: primes) {
            assertEquals(i + " is a prime: false", mathService.checkPrime(i));
        }
    }
}
