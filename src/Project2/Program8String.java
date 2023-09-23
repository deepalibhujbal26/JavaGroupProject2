package Project2;

import java.util.Scanner;

public class Program8String {
    /*
    Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
     */
    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "53456";
        String input3 = "29";

        System.out.println("Increment : " + Increment(input1));
        System.out.println("Increment : " + Increment(input2));

        System.out.println("Increment : " + Increment(input3));


    }

    private static String Increment(String str) {

        int number = Integer.parseInt(str);
        number++;

        return Integer.toString(number);
    }

}
