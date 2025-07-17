package Patterns;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of rows you want in inverted pyramid: ");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=((2*(n-i))+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
