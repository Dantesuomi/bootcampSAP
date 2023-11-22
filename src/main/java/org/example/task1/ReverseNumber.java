package org.example.task1;

public class ReverseNumber {

    public static void whileLoopReverse() {

        int num = 123456789;
        int reversedNum = 0;

        System.out.println("Initial number = " + num);

        try {
            if (num < 0) {
                throw new IllegalArgumentException("Input number cannot be negative");
            }
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            System.out.println("Reversed number = " + reversedNum);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}