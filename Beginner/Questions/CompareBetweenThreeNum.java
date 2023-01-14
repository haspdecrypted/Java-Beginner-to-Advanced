package Beginner.Questions;

public class CompareBetweenThreeNum {
    public static void main(String[] args) {
        int num1=12, num2=230, num3=34, comp_g=0, comp_l=0;
        comp_g= (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        comp_l= (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        System.out.println("Number which is greater: "+comp_g);
        System.out.println("Number which is lesser: "+comp_l);
    }
}
