package com.example;

import com.example.Calculator;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.calculate("add", 10, 5);
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Calculation result: %d", result));
        }

        UserService service = new UserService();

        try {
            service.findUser("admin");
        } catch (Exception e) {
            logger.severe("Error fetching user: " + e.getMessage());
            logger.severe(java.util.Arrays.toString(e.getStackTrace()));
        }
    }
}