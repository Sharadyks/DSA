package Basics.Basic_Math;

import java.util.Scanner;

public class NumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int n = input.nextInt();
        System.out.println("The number of digits are "+countDigit(n));
    }

    public static int countDigit(int n){
//        int count =0;
//        while (n>0){
//            count++;
//            n = n/10;
//        }
//        return count;
        int count = (int)Math.log10(n) + 1;
        return count;
    }
}
