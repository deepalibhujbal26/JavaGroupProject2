package Project2;

import java.util.Arrays;

public class Program5Anagram {

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        String str1Sorted = new String(array1);
        String str2Sorted = new String(array2);

        if (str1Sorted.length() == str2Sorted.length()) {
            if (str1Sorted.equals(str2Sorted)) {
                System.out.println("It is an Anagram");
            } else {
                System.out.println("Its not an Anagram");
            }
        } else {
            System.out.println("Its not an Anagram");
        }

    }
}
