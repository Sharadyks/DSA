package Basics.Basic_Recursion;

import java.util.Scanner;

public class noIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = input.nextInt();
        f1(n,n);
    }

    static void f1(int n, int i){
        if (i<1){
            return;
        }else {
            f1(n,i-1);
        }
        System.out.println(i);
    }
}
