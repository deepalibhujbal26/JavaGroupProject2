package Project2;

public class Program1String {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 String without a temporary variable?
         */

        String name1 = "Deepali";
        String name2 = "Bhujbal";


        System.out.println(" Name1  value : " + name1);
        System.out.println(" Name2  value : " + name2);


        name1 = name1 + name2;
        name2 = name1.substring(0, name1.length() / 2);
        name1 = name1.substring(name1.length() / 2, name1.length());


        /* name1=name1+" ,"+name2;
         name2=name1.split(",")[0];
         name1=name1.split(",")[1];
        System.out.println(name1+" "+name2); */


        System.out.println("After........");

        System.out.println(" Name1  value : " + name1);
        System.out.println(" Name2  value : " + name2);

    }
}
