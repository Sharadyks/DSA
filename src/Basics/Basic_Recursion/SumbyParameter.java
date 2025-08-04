package Basics.Basic_Recursion;
// PATTERN - PARAMETERIZED
import java.util.Scanner;

public class SumbyParameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        f1(n,0);
    }

   static void f1(int i, int sum){
       if (i<1){
           System.out.println(sum);
       } else {
           f1(i - 1, sum + i);

       }

    }
}
