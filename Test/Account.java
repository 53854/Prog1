package lec_07;

import java.util.Scanner;

public class Account {
    private String user;
    private double balance;

    private static double interest = 0.17;

    public Account(String u, double b){
        user    = u;
        balance = b;
    }

    public String getUser(){
        return user;
    }

    public double getBalance(){
        return balance;
    }

    public void topUp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Top up amount: ");
        balance += sc.nextDouble();
        System.out.println("New balance is: " + balance);
        sc.close();
    }

    public void topUp(double amount){
        balance += amount;
        System.out.println("New balance is: " + balance);
    }
    
    @Override
    public String toString() {
        return "Account: " + user + " " + balance;    
    }

    public String interestRate(){
        return "Interest rate is at: " + interest + "%";
    }

    public void annualReturn(){
        double returnAmount = interest * balance;
        balance += returnAmount;

        System.out.println("Balance after interest: " + balance);
    }
}