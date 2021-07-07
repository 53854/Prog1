package lec_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        task_6_4(sc);
        sc.close();
    }

    static void task_6_1(Scanner sc){

        System.out.print("Length of array: ");
        int count = sc.nextInt();
        float total = 0;
        float mean = 0;

        for(int i = 0; i < count; i++){
            System.out.print("New element: ");
            total += (float)sc.nextFloat();;
        }

        mean = total / count;
        System.out.printf("Mean is: %.2f%n", mean);
    }

    static void task_6_2(Scanner sc){
        int maxSeat = 10;
        int maxRow = 5;

        System.out.print("Row: ");
        int row = sc.nextInt();

        System.out.print("Seat: ");
        int seat = sc.nextInt();

        StringBuilder showRow = new StringBuilder();

        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < maxSeat; j++) {
                if(i == row-1 && j == seat -1){
                    showRow.append(1 + " ");
                } else showRow.append(0 + " ");
            }
            System.out.println(showRow);
            showRow.setLength(0);
        }
    }

    static void task_6_3(Scanner sc){
        enum dice {one,two,three,four,five,six};
        dice[] diceArr = dice.values();
        int roll = (int)(Math.random() * diceArr.length);
        System.out.println("Roll: " + diceArr[roll]);
        System.out.println("Roll again? (y/n)");
        if(sc.next().equals("y")) task_6_3(sc);
    }

    static void task_6_4(Scanner sc){
        ArrayList<Float> elems = new ArrayList<Float>();
        float total = 0;
        float mean = 0;
        int count = 0;
        boolean next = true;
        String outString = "";

        while (next) {
            System.out.print("Enter value: ");
            if (sc.hasNextFloat()){
                float e = sc.nextFloat();
                elems.add(e);
                total += e;
                count ++;
                mean = total / count;
                for (float f: elems) {
                    String fString = String.format("%.2f%n", f);
                    outString += fString + "\t";
                }
                outString += String.format("Mean: %.2f%n", mean);
                System.out.println(outString);
            } else next = false;
        }

    }
}
