package Basics.Basic_Recursion;

import java.util.Scanner;

public class FactorialbyRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter of number: ");
        int n = input.nextInt();
        System.out.printf("Factorial of %d is %d",n,fact(n));
    }
    static int fact(int n){
        if (n==0){
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }
}
