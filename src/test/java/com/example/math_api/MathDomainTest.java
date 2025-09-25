package com.example.math_api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathDomainTest {
    private MathDomain mathDomain;

    public MathDomainTest(){
        this.mathDomain = new MathDomain();
    }

    @Test
    public void checkPrime_returnsTrueForPrimes(){
        int[] primes = {2,3,5,37,127};
        for (int i: primes) {
            assertTrue(mathDomain.checkPrime(i));
        }
    }

    @Test
    public void checkPrime_returnsFalseForNonPrimes(){
        int[] primes = {4,10,25,64};
        for (int i: primes) {
            assertFalse(mathDomain.checkPrime(i));
        }
    }

    @Test
    public void checkPrime_returnsFalseForEdgeCases(){
        int[] primes = {0,1};
        for (int i: primes) {
            assertFalse(mathDomain.checkPrime(i));
        }
    }


}
