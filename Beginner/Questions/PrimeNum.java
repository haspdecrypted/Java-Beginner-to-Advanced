package Beginner.Questions;

import java.util.Scanner;

public class PrimeNum {
    static int i=2;
    public static boolean isPrime(int n) {

    //corner case
        if(n==0||n==1) {
            return false;
    }
    //checking prime
        if(n==i) {
        return true;
        }
        //base case
        if(n%i==0) {

        return false;}

        i++;

        return isPrime(n);}

    public static void main(String[] args) {
        System.out.println("Enter your input");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("It is Prime");
        } else {
            System.out.println("It is Not Prime");
        }
    }

    }

