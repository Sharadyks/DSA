package Basics.Patterns;

import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Right Half Pyramid maker!!");
        System.out.print("Enter the no. of rows you want: ");
        int a = input.nextInt();
        for (int i = 0; i<a; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
