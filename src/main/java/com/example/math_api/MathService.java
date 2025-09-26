package com.example.math_api;

import com.example.math_api.exception.InvalidNumberInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    private MathDomain mathDomain;
    private static final Logger logger = LoggerFactory.getLogger(MathService.class);

    public MathService(){
        this.mathDomain = new MathDomain();
    }


    public MathDTO checkPrime(int number) {
        if (number < 1) throw new InvalidNumberInput(number);
        return new MathDTO(number, mathDomain.checkPrime(number));
    }

    @Cacheable(value = "mathDTO", key = "#number")
    public MathDTO getPrimesBelowInputNumber(int number) {
        logger.info("Only run this if {} is not in cache", number);
        if (number < 1) throw new InvalidNumberInput(number);
        return new MathDTO(number, mathDomain.checkPrime(number), mathDomain.getPrimesBelowInputNumber(number));
    }
}
