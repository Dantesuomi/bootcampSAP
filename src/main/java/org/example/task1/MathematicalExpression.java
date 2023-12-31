package org.example.task1;

import java.util.Scanner;

public class MathematicalExpression {

    public static void calculate(){
    do {
        doExpression();
        System.out.print("Do you want to perform another calculation? (yes/no): ");
    } while (new Scanner(System.in).nextLine().equalsIgnoreCase("yes"));
        System.out.println("Calculator closed.");
    }

    public static void doExpression() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = getNumberInput(scanner);

            char operator;
            do {
                System.out.print("Enter the operator (+, -, *, /): ");
                operator = getOperatorInput(scanner);
            } while (operator == 0);

            System.out.print("Enter the second number: ");
            double num2 = getNumberInput(scanner);

            double result = performExpression(num1, operator, num2);
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
            System.out.println("Invalid operator: " + input);
            return 0;
        }
        return input.charAt(0);
    }

    private static double performExpression(double num1, char operator, double num2) throws ArithmeticException {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("You cannot divide by 0");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
