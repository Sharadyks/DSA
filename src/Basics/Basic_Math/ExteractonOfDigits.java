package Basics.Basic_Math;

public class ExteractonOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        while (n>0){
            int lastDigit;
            lastDigit = n%10;
            System.out.print(String.valueOf(lastDigit));
            n = n/10;
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nGO!!!...");
    }
}
