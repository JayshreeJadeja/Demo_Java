package src;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++);
        // a =11+11 =22
        System.out.println(a);//a=23

        //int b=20;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b % 2 == 1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even number");
        }
    }
}
