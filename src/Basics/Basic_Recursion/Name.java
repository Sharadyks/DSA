package Basics.Basic_Recursion;

import java.util.Scanner;

public class Name {

    static void name(int n, int i){
        if(i==n){
            return;
        } else
            System.out.println("Sharad");
        i++;
        name(n,i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of times you want to print the name: ");
        int n = input.nextInt();
        name(n,0);
    }
}
