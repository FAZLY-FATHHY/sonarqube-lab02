package com.example;

public class App {

    public static void main(String[] args) {

        // Create Calculator object
        Calculator calc = new Calculator();

        // Perform addition
        System.out.println("10 + 5 = " + calc.calculate(10, 5, "add"));

        // Create UserService object and find user
        UserService service = new UserService();
        service.findUser("admin");
    }
}

// Minimal Calculator class
class Calculator {
    public int calculate(int a, int b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else throw new IllegalArgumentException("Cannot divide by zero");
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}

// Minimal UserService class
class UserService {
    public void findUser(String username) {
        // Just a demo print
        System.out.println("Finding user: " + username);
    }
}
