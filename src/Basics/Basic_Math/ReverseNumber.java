package Basics.Basic_Math;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int n = input.nextInt();
        System.out.println(reverseNum(n));

    }
    public static int reverseNum(int n){
        int sum = 0;
        while (n>0){
            int lastDigit = n%10;
            sum = (sum*10) + lastDigit;
            n = n/10;
        }
        return sum;
    }
}
