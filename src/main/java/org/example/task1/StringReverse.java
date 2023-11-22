package org.example.task1;

import java.util.Scanner;

public class StringReverse {

    public static void doReverse() {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String original = scanner.nextLine().trim();
            System.out.println("String you entered: " + original);

            StringBuilder reversedStringBuilder = new StringBuilder(original);
            reversedStringBuilder.reverse();

            String reversed = reversedStringBuilder.toString();
            System.out.println("Reversed: " + reversed);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            }
        }
}
