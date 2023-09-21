package Project2;

public class Program2String {
    public static void main(String[] args) {
        /*
        Reverse a String: Write a function to reverse a given string. For
        example, given the input "Hello", the output should be "olleH".
         */

        String str = "Hello";
        System.out.println("Given String :"+str);
        System.out.println("Reversed String : ");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
