package com.hechaol.example.aspectj.main;

import com.hechaol.example.aspectj.business.Calculator;

public class Main {

    public static void main(String[] args) {
        int sum = Calculator.add(41, 42);
        System.out.println("====== The sum is: " + sum);

        System.out.println();

        try {
            int quotient = Calculator.divide(42, 0);
            System.out.println("====== The quotient is: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("====== Got exception: " + e);
        }
    }
}
