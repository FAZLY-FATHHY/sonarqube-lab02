package com.example;

public class Calculator {

    // Refactored calculate method using switch expression (cleaner & simpler)
    public int calculate(int a, int b, String op) {
        return switch (op.toLowerCase()) {
            case "add" -> a + b;
            case "sub" -> a - b;
            case "mul" -> a * b;
            case "div" -> b != 0 ? a / b : 0; // handle division by zero
            case "mod" -> b != 0 ? a % b : 0; // handle modulo by zero
            default -> 0; // unknown operation
        };
    }

    // Remove duplicate add methods, keep only one
    public int add(int x, int y) {
        return x + y;
    }
}
