package lec03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task_3_5(sc);
        sc.close();
    }

    static void Task_3_1(Scanner sc){
        int a = 0,b = 0;

        System.out.println("Enter int a:");
        a = sc.nextInt();

        System.out.println("Enter int b:");
        b = sc.nextInt();

        System.out.println("Abs : " + Math.abs(a) + ", " + Math.abs(b));
        System.out.println("Min : " + Math.min(a,b));
        System.out.println("Mult: " + (a * b));
    }

    static void Task_3_2(Scanner sc){
        System.out.println("Enter int a:");
        int a = sc.nextInt();
        System.out.println((a%2 == 0));
    }

    static void Task_3_3(Scanner sc){
        System.out.println("Enter string:");
        String a = sc.nextLine();
        System.out.println("Enter same string again:");
        String b = sc.nextLine();

        System.out.println(a.equals(b));
    }

    static void Task_3_4(Scanner sc){
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter first name:");
        sb.append(sc.nextLine());
        sb.append("; ");

        System.out.println("Enter last name:");
        sb.append(sc.nextLine());
        sb.append("; ");

        System.out.println("Enter last dob:");
        sb.append(sc.nextLine());
        sb.append("; ");

        System.out.println(sb);
    }

    static void Task_3_5(Scanner sc){
        float c = 0.00f;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter temp in °C:");
        c = sc.nextFloat();
        System.out.println(
                "°C: " + df.format(c) +
                "\n°F: " + df.format(c * (9f/5f) + 32f) +     /* C -> F = (C × 9/5) + 32 */
                "\n°K: " + df.format(c + 273.15f)           /* C -> K = (C + 273.15)  */
        );
    }
}
