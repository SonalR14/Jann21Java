package exceptionhandling;

import java.util.Scanner;

public class ArrayExcepHandle {
    public void handle_Array(){
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter array size: ");
            int a = sc.nextInt();
            int[] array = new int[a];
            for (int i =0;i< array.length;i++){
                System.out.println("Enter arrayElements: ");
                array[i]=sc.nextInt();
            }
            for (int i=0;i< array.length;i++){
                System.out.println(array[i]);
            }
            for (int j : array){
                j=sc.nextInt();
                System.out.println(array[j]);
                System.out.println("Enter divisor to devide: ");
                int b = sc.nextInt();
                int Result = array[j] / b;
                System.out.println(Result);
                break;

            }
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ArrayExcepHandle obj = new ArrayExcepHandle();
        obj.handle_Array();
    }
}
