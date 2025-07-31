package Basics.Basic_Math;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Divisor(n);
    }
    public static void Divisor(int n){

        for (int i =1; i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }

    }
}
