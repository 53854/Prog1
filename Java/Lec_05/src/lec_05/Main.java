package lec_05;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]sampleArr = {1,2,3,4,5,6,5,2};
        Task_5_6(sampleArr);
        sc.close();
    }

    public static void Task_5_1(){
        int cap = 2048;
        for (int i = 1; i <= cap; i = 2*i) {
            String printString = i + ", ";
            if(i >= cap)printString = Integer.toString(i);
            System.out.print(printString);
        }
    }

    public static void Task_5_2(){
        int val = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Run " + i+1 + ": " + val);
            val = val << 1;
        }
    }

    public static void Task_5_3(Scanner sc){
        String password = "test";
        String input = "";
        boolean correct = false;
        int counter = 0;
        while(!correct){
            System.out.println("Password?");
            if(sc.nextLine().equals(password)){
                correct = true;
            } else {
                counter++;
                if(counter < 3){
                    System.out.println("False, try again!");
                } else {
                    System.out.println("Get lost!");
                    return;
                }
            }
        }
        System.out.println("Open Sesumi");
    }

    public static void Task_5_4(Scanner sc){
        System.out.println("Faculty of: ");
        int facIn   = sc.nextInt();
        int facOut  = 1;

        for (int i = facIn; i > 0; i--) {
            facOut *= i;
        }
        System.out.println("Faculty of" + facIn + " = " + facOut);
    }

    public static void Task_5_5(Scanner sc){
        System.out.println("How many fibonacci elements would you like to know?");

        int count   = sc.nextInt() - 2;
        int fibOne  = 1;
        int fibTwo  = 1;
        int fibNext;
        String outString;

        System.out.print(fibOne + ", " + fibTwo + ", ");

        for (int i = 0; i < count ; i++) {

            fibNext = fibOne + fibTwo;
            outString = Integer.toString(fibNext);

            if((i < count -1)) outString += ", ";
            System.out.print(outString);

            fibOne = fibTwo;
            fibTwo = fibNext;
        }
    }

    public static void Task_5_6(int[] arr){

        int len = arr.length;;
        int sum = 0;
        int eve = 0;

        Set<Integer> unique = new HashSet<Integer>();
        int duplicate = 0;

        for (int e : arr) {
            sum += e;
            if(e%2 == 0) eve ++;
            if(!unique.add(e)) duplicate ++;
        }

        System.out.println("Len: " + len + ", Sum: " + sum + ", Amount even:  " + eve + ", Amount Duplicates: " + duplicate);
    }
}