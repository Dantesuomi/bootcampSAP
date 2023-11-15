package org.example.task1;

public class SumOfEvenNumbersArray {

        public static void makeSumOfNumbers() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int sumEven = 0;
            int sumOdd = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }

            System.out.println("Sum of even numbers: " + sumEven);
            System.out.println("Sum of odd numbers: " + sumOdd);
        }
    }

