package com.hechaol.example.aspectj.business;

import com.hechaol.example.aspectj.annotation.TraceLog;

public class Calculator {

    @TraceLog
    public static int add(int a, int b) {
        return a + b;
    }

    @TraceLog
    public static int sub(int a, int b) {
        return a - b;
    }

    @TraceLog
    public static int multiply(int a, int b) {
        return a * b;
    }

    @TraceLog
    public static int divide(int a, int b) {
        return a / b;
    }
}
