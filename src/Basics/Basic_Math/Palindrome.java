package Basics.Basic_Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        int a;
        a = n;
        int sum = 0;
        while (n>0){
            int lastDigit = n%10;
            sum = (sum*10) + lastDigit ;
            n = n/10;
        }
        return sum == a;
    }
}
