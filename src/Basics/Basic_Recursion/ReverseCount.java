package Basics.Basic_Recursion;

import java.util.Scanner;

public class ReverseCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = input.nextInt();
        revCount(n,0);
    }

    static void revCount(int n, int i){
        if (n<=i){
            return;
        } else
            System.out.println(n);

        revCount(n-1,i);
    }
}
