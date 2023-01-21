package string;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = sc.nextLine();

        System.out.println(test(input)?"Strings contains only vowels":"Strings contains letters other than vowels");
    }

    public static boolean test(String input) {
        String vowels = "aeiou";
        String lcase = input.toLowerCase();

        for (int i = 0; i < lcase.length(); i++) {
            if (vowels.indexOf(lcase.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}


