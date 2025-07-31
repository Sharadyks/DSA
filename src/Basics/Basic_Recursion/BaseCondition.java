package Basics.Basic_Recursion;

public class BaseCondition {
    public static void main(String[] args) {
        int count =0;
        f1(count);
    }

    static void f1(int count){
        if (count==4){
            return;
        } else
            System.out.println(count);
        count++;
        f1(count);
    }
}
