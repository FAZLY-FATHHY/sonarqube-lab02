package com.example.calculator;

import java.util.function.IntBinaryOperator;
import java.util.Map;

public class Calculator {
    private Map<String, IntBinaryOperator> operations = Map.of(
        "add", (a, b) -> a + b,
        "subtract", (a, b) -> a - b,
        "multiply", (a, b) -> a * b,
        "divide", (a, b) -> a / b
    );

    public int calculate(String operation, int a, int b) {
        return operations.get(operation).applyAsInt(a, b);
    }
}