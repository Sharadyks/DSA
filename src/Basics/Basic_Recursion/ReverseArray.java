package Basics.Basic_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++){
            arr[i] = input.nextInt();
        }

//        revArr(arr,0,arr.length-1);
//        f1(arr,0);
        System.out.println(Arrays.toString(arr));
    }
//    BY TWO PARAMETERS
//    static void revArr(int[] arr, int l, int r){
//       if (l>=r){
//           return;
//       } else {
//           int temp = arr[l];
//           arr[l] = arr[r];
//           arr[r] = temp;
//       }
//        revArr(arr,l+1,r-1);
//    }

//    BY SINGLE PARAMETER
//    static void f1(int[] arr, int i){
//        if (i>=arr.length/2){
//            return;
//        } else {
//            int temp = arr[arr.length-i-1];
//            arr[arr.length-i-1] = arr[i];
//            arr[i] = temp;
//        }
//        f1(arr,i+1);
//    }
}
