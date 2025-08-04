package Basics.Basic_Recursion;

public class FactorialbyParameter {
    public static void main(String[] args) {
        f1(5,1);
    }

    static void f1(int i, int fact){
        if (i<1){
            System.out.println("The factorial is "+fact);
        } else {
            f1(i-1,fact*i);
        }
    }
}
