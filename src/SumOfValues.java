import java.util.Scanner;

public class SumOfValues {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner scanner=new Scanner(System.in);
        char choice;
        do{
            System.out.println("enter value");
            num =scanner.nextInt();
            sum=sum+num;
            System.out.println("do u want to continue y or n");
            choice=scanner.next().charAt(0);
        }while(choice=='y'|| choice=='n');
        System.out.println("addition is => "+sum);
    }
}
