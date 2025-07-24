package Basics.Patterns;

import java.util.Scanner;

public class NumericalM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for (int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for (int l = i; l>=1 ;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
