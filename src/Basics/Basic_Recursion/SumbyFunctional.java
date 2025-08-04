package Basics.Basic_Recursion;

import java.util.Scanner;

public class SumbyFunctional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("Your answer is %d", f1(n));
    }
    static int f1(int n){
        if (n==0){
            return 0;
        } else {
            return n + f1(n - 1);
        }
    }
}
