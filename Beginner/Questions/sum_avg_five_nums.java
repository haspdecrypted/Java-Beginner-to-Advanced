package Beginner.Questions;

public class sum_avg_five_nums
{
    public static void main(String[] args) {
        int num1=12,num2=34,num3=54, num4=76, num5=98,sum=0,avg=0;
        sum=num1+num2+num3+num4+num5;
        System.out.println("the sum of the numbers: " +sum);
        avg=sum/5;
        System.out.println("the average is: "+ avg);

    }
}
