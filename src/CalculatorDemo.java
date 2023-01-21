import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        int num1,num2;
        char operator;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value for num1");
        num1=scanner.nextInt();
        System.out.println("enter value for num1");
        num2=scanner.nextInt();
        System.out.println("enter operator");
        operator=scanner.next().charAt(0);
        switch(operator){
            case'+':
                System.out.println(num1+num2);
            case'-':
                System.out.println(num2-num1);
            case'*':
                System.out.println(num1*num2);
            case'/':
                System.out.println(num1/num2);
        }

    }
}
