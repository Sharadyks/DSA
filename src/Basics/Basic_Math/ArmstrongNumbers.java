package Basics.Basic_Math;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n){
        int a = n;
        int sum = 0;
        while (n>0){
            int lastDigit = n%10;
            sum = (int)(sum + Math.pow(lastDigit,3));
            n = n/10;
        }
        return sum == a;
    }
}

