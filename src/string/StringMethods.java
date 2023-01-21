package string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str1=" welcome to java  ";
        System.out.println(str1);
        String str2="Pune is metrocity";

        System.out.println(str2);
        System.out.println("reverse string is:");

        for(int i=str2.length()-1;i>=0;i--)
            {
            System.out.print(str2.charAt(i));
        }
//        Scanner sc=new Scanner(System.in);
//        String str4=sc.nextLine();
//        System.out.println(str4);

//        System.out.println(str1.substring(0));
//        System.out.println(str1);
//
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.replace("av","abc"));
//        System.out.println(str1.startsWith("w"));
//        System.out.println(str1.endsWith("a"));
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.indexOf("t"));
//        System.out.println(str1.charAt(8));
//        System.out.println(str1.trim());
//      System.out.println(str1.replace("   "," ").trim());
//


    }
}