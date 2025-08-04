package Basics.Basic_Recursion;
import java.util.Scanner;

public class noDecrement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        f1(n,1);
    }

    static void f1(int n, int i){
        if (i>n){
            return;
        } else {
            f1(n,i+1);
        }
        System.out.println(i);
    }
}
