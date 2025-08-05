package Basics.Basic_Recursion;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        System.out.println(isPalindrome(str, 0));
    }

    static boolean isPalindrome(String s1,int i){
        int n = s1.length();
        if (i>=n/2){
            return true;
        }
      if (s1.charAt(i) != s1.charAt(n-i-1)){
          return false;
      } else {
           return isPalindrome(s1,i+1);
      }
    }
}
