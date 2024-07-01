package src;

import java.util.Scanner;

public class Lab004_If {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter score");
        int score=sc.nextInt();
        char c='F';

        if(score>=90 && score <=100)
        {
            //grade='A';
            System.out.println("Grade A ->" + score);

        } else if (score>= 80 && score <=90) {
            System.out.println("Grade B"+score);
        }else if (score>= 70 && score <=80) {
            System.out.println("Grade C"+score);
        }else if (score>= 60 && score <=70) {
            System.out.println("Grade C"+score);
        }
        else if (score>= 50 && score <=60) {
            System.out.println("Grade C");
        }
        else if (score>= 40 && score <=50) {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
