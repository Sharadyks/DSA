package Basics.Basic_Hashing;

import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();

        int[] hash = new int[25];
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a'] += 1;
        }
        int q = input.nextInt();
        while (q>0){
            char c = input.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}
