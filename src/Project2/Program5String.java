package Project2;

public class Program5String {
    public static void main(String[] args) {
        /*
        Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
         meaning they contain the same characters in a
      different order. For example, "listen" and "silent" are anagrams.
         */

        // first word => silent
        // second word => listen
        // first, check the length of both string is equal
        // Loop through each character of first word
        // check if that character exist in second word
        // also check if that character exist same number of time in second word

        String str1 = "sadder";
        String str2 = "dreads";
        Boolean isAnagram = true;


        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                int count1 = getCount(str1, ch);
                int count2 = getCount(str2, ch);
                if (str2.indexOf(ch) > -1 && count1 == count2) {
                    isAnagram = true;
                } else {
                    isAnagram = false;
                    break;
                }
            }
        } else {
            isAnagram = false;
        }

        if (isAnagram) {
            System.out.println("Given two string are Anagram");
        } else {
            System.out.println("Given two strings are not Anagram");
        }
    }

    private static int getCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        // System.out.println(ch + " count is " + count);
        return count;
    }


}






