package com.example.math_api.Exception;

public class InvalidNumberInput extends RuntimeException{
    public InvalidNumberInput(Object number) {
        super("Number input is invalid: " + number);
    }

}
