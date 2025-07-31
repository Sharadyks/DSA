// HERE WE WILL SEE STACK OVERFLOW
package Basics.Basic_Recursion;

public class Basic {
    public static void main(String[] args) {
       greeting();
    }

    static void greeting(){
        System.out.println("Hello I am Sharad");
        greeting();
    }
}
