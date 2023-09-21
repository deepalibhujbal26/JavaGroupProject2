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

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=scanner.next();
        //  Increment(str);
        System.out.println(Increment(str));


    }

    private static String Increment(String str) {

        String newStr="";

       int lastDigit=str.length()-1;
       if(lastDigit==str.length()){
          newStr+= lastDigit;
       }
        return newStr;




    }

}
