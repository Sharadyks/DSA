package Basics.Basic_Hashing;
import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int[] hash = new int[1000];
        for (int i=0; i<n; i++){
            hash[arr[i]] += 1;
        }

        int q = input.nextInt();
        while (q>0){
            int numbers = input.nextInt();
            System.out.println(hash[numbers]);
        }
    }
}


