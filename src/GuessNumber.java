import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num;
        int guessNumber;
        num=(int) (Math.random()*100)+1;
        Scanner scanner=new Scanner(System.in);
        int counter=1;
        do{
            System.out.println("enter number");
            guessNumber=scanner.nextInt();
            counter++;
            if(num>guessNumber){
                System.out.println("enter number greater");
            }else if(num<guessNumber){
                System.out.println("enter number smaller");
            }else{
                System.out.println("u guess correct"+counter);
            }
        }while(num!=guessNumber);
    }
}
