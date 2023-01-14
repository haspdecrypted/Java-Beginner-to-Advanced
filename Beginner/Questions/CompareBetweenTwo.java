package Beginner.Questions;

import java.sql.SQLOutput;

public class CompareBetweenTwo {
    public static void main(String[] args) {
        int num1=43, num2=350;
        int comp_g=(num1>num2)?num1:num2;
        int comp_l=(num1<num2)?num1:num2;
        System.out.println("the greater will be = "+comp_g);
        System.out.println("the greater will be = "+comp_l);
    }
}
