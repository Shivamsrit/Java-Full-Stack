package CH01CoreJava.CH12ExceptionHandling;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create an acount ");
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter ammount ");
        double balance = 0;
        if(sc.hasNextInt()){
            balance = sc.nextInt();
        }
        UnionBank ob1 = new UnionBank(name, balance);
        System.out.println("1.Deposite");
        System.out.println("2.WithDrawal");
        System.out.println("3.CheckBalance");
        System.out.println("4.Exit");
        int flag = 1;
        while (flag == 1) {
            sc.nextLine();
            System.out.println("enter your choice");
            int i = 0;
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            }
            if (i == 1) {
                System.out.println("Enter amount to be deposite");
                int amount = sc.nextInt();
                ob1.deposite(amount);
            } else if (i == 2) {
                int amount = sc.nextInt();
                try {
                    ob1.withdrawal(amount);
                } catch (InsufficientBalanceException ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (i == 3) {
                System.out.println("Balnace : " + ob1.checkBalance());
            } else if (i == 4) {
                flag = 0;
                System.out.println("exit");
            } else {
                System.out.println("Invalid Input");
            }
            
        }
    }
}

