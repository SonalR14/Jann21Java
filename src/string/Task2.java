package string;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        System.out.print("Check all the characters of the said string are vowels or not!\n");
        System.out.print(test(str));
    }

    public static boolean test(String input) {
        String str_vowels = "aeiou";
        String s = input.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (str_vowels.indexOf(s.charAt(i)) == -1)
                return false;
        }
        return true;
    }
}

