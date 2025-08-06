package Basics.Basic_Recursion.Multiple_Recursion_Calls;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
        System.out.println(fibbo(n));
    }
    static int fibbo(int n){
        if (n<=1){
            return n;
        } else {
         return fibbo(n-1)+fibbo(n-2);
        }
    }
}
