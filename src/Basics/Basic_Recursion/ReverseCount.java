package Basics.Basic_Recursion;

import java.util.Scanner;

public class ReverseCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = input.nextInt();
        revCount(n,0);
        System.out.println("Happy new year");
    }

    static void revCount(int n, int i){
        if (n<=i){
            return;
        } else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(n);
        }
        revCount(n-1,i);
    }
}
