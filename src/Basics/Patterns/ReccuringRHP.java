package Basics.Patterns;

import java.util.Scanner;

public class ReccuringRHP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Recurring numerical right half pyramid makker!!");
        System.out.print("Enter the no. of rows you want: ");
        int a = input.nextInt();
        for (int i = 1; i<=a; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
