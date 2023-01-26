package Beginner.Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1. You are given as input marks of a student.
2. Display an appropriate message based on the following rules:
  	  2.1 for marks above 90, print excellent.
  	  2.2 for marks above 80 and less than equal to 90, print good.
  	  2.3 for marks above 70 and less than equal to 80, print fair.
  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
  	  2.5 for marks less than equal to 60, print below par.
* */
public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
    if(input>0)
        {
            if (input > 90) {
                System.out.println("Excellent");
            } else if (input > 80 && input <= 90) {
                System.out.println("Good");
            } else if (input > 70 && input <= 80) {
                System.out.println("Fair");
            } else if (input > 60 && input <= 70) {
                System.out.println("Meets Expectations");
            } else if (input <= 60) {
                System.out.println("Below Par");
            }
        }
    else System.out.println("Invalid");
    }
}
