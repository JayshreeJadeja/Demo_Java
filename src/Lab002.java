package src;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A " + a);
        } else
            System.out.println("B" + b);
    }
}
