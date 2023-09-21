package Project2;

import java.util.Scanner;

public class Program3String {
    /*
    Check if a String is Palindrome: Determine whether a given string is a palindrome,
    which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
     */
    public static void main(String[] args) {
        // String str = "hello";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str1 = scanner.nextLine();
        String reversedString = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reversedString = reversedString + str1.charAt(i);
        }
        if (reversedString.equalsIgnoreCase(str1)) {
            System.out.println("It is an Palindrome");
        } else {
            System.out.println("It is not an Palindrome");
        }
    }
}
