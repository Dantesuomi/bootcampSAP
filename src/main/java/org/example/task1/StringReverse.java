package org.example.task1;

public class StringReverse {

    public static void doReverse() {

        String original = "Pepega The Best !";
        System.out.println("Original: " + original);

        StringBuilder reversedStringBuilder = new StringBuilder(original);
        reversedStringBuilder.reverse();

        String reversed = reversedStringBuilder.toString();;
        System.out.println("Reversed: " + reversed);

    }
}
