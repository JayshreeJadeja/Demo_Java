package src;


import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if (num>20)
        {
            System.out.println("Number is >20");
        } else if (num>10) {
            System.out.println("Number is >10");
        }else
        {
            System.out.println("Number is<20");
        }
    }
}
