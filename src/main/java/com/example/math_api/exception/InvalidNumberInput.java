package com.example.math_api.exception;

public class InvalidNumberInput extends RuntimeException{
    public InvalidNumberInput(Object number) {
        super("Number input is invalid: " + number);
    }

}
