package exceptionhandling;


import java.util.Scanner;

public class Task1 {

    private String acc_no;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account No: ");
        acc_no = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    void showAccount() {
        System.out.println(acc_no + "," + name + "," + balance);
    }
    void deposit() {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = sc.nextLong();
        balance = balance + amt;

    }
  void withdraw(){


  }
}
