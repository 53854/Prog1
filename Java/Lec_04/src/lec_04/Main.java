package lec_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        //Task_4_1(sc);
        Task_4_2(sc);

        sc.close();
    }

    static void Task_4_1(Scanner sc){
        String testPhrase = "end me pls";

        System.out.println("Please re-type the following phrase:"+ testPhrase);

        if (!testPhrase.equals(sc.nextLine())) {
            System.out.println("WRONG KIDDO, TRY AGAIN!");
            Task_4_1(sc);
        }
    }

    static void Task_4_2(Scanner sc){

        System.out.println("Enter a whole number between [10,20]:");
        int userNumber = sc.nextInt();

        if(userNumber > 20 || userNumber < 10){
            System.out.printf("R U DUM OR STH? %d ain't no part of [10,20]%n", userNumber);
        } else {
            System.out.printf("Guuud boiiii, %d is indeed between [10,20]...%n", userNumber);
        }
    }

    static void Task_4_3(Scanner sc){
        System.out.println("Enter a whole number between [10,20]:");
        int userNumber = sc.nextInt();

        if(userNumber > 20 ){
            System.out.printf("I too high bruv, %d way above 20%n", userNumber);
        } else if (userNumber < 10){
            System.out.printf("Ain't talking bout yo bank account, %d is less than 10, like your pp...%n", userNumber);
        } else {
            System.out.printf("Ayyy, not bullseye but %d is indeed between [10,20]%n", userNumber);
        }
    }

    static void Task_4_4(Scanner sc){
        System.out.print ("Can I be impolite? (Y | N)");
        if("y".equalsIgnoreCase(sc.nextLine())){
            System.out.println("Sup beagle?");
        } else if("n".equalsIgnoreCase(sc.nextLine())){
            System.out.println("Alright your highness...");
        } else {
            System.out.println("Sorry WHAT? CAN YOU SAY THAT AGAIN?");
            Task_4_4(sc);
        }
    }

    static void Task_4_5(Scanner sc){
        System.out.print ("Enter a whole number between 1 and 5");

        int userNumber = sc.nextInt();

        String numberAsWord = switch (userNumber) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "threee";
            case 4 -> "foh";
            case 5 -> "feyve";
            default -> "Invalid input";
        };

        System.out.println(userNumber);
    }



}
