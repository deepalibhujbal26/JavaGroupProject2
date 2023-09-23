package Project2;

import java.util.ArrayList;

public class Program7ArrayListString {
    /*
    You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"

     */

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Deepali");
        names.add("Supresh");
        names.add("Ajamel");
        names.add("Ritvi");
        names.add("anwar");


        for (int i = 0; i <names.size(); i++) {
            if (names.get(i).startsWith("A") || names.get(i).startsWith("a")) {

                System.out.println(names.get(i).toLowerCase());
            }

        }
    }
}
