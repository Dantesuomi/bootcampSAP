package org.example.task1;

import java.util.Scanner;

public class MathematicalExpression {

    public static void doExpression(){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = getNumberInput(scanner);
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = getOperatorInput(scanner);
            System.out.print("Enter the second number: ");
            double num2 = getNumberInput(scanner);

            double result = evaluateExpression(num1, operator, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
}

    private static double getNumberInput(Scanner scanner) throws IllegalArgumentException {
        String input = scanner.nextLine();
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        return Double.parseDouble(input);
    }

    private static char getOperatorInput(Scanner scanner) throws IllegalArgumentException {
        String input = scanner.nextLine();
        if (input == null || input.trim().isEmpty() || input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1) {
            throw new IllegalArgumentException("Invalid operator: " + input);
        }
        return input.charAt(0);
    }

    private static double evaluateExpression(double num1, char operator, double num2) throws ArithmeticException {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
