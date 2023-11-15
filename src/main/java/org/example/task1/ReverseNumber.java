package org.example.task1;

public class ReverseNumber {

    public static void whileLoopReverse() {
        int num = 123456789;
        int reversedNum = 0;

        System.out.println("Initial number = " + num);

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number = " + reversedNum);
    }
}