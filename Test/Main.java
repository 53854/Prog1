package lec_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Username: ");
        String user = sc.nextLine();

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        Account newAcc = new Account(user, balance);

        //System.out.println("User: " + newAcc.getUser() + " Balance: " + newAcc.getBalance());
        //System.out.println(newAcc.toString());
        newAcc.annualReturn();
        sc.close();
    }
}
