package Basics.Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i<=n-1; i++){
            for (int j=0; j<=((n-1)-i); j++){
                System.out.print("*");
            }
            for (int k=1; k<=i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
