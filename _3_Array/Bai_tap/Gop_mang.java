package _3_Array.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];

        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < arr1.length; i++) {
            System.out.println("Mời bạn nhập số thứ " + (i+1) +" của mảng đầu tiên: ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        for( int j = 0; j < arr2.length; j++) {
            System.out.println("Mời bạn nhập số thứ " + (j+1) +" của mảng thứ hai: ");
            arr2[j] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng đầu tiên bạn vừa nhập là: " + Arrays.toString(arr1));
        System.out.println("Mảng thứ hai bạn vừa nhập là: " + Arrays.toString(arr2));

        for ( int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for ( int i = 0; i < arr2.length; i++){
            arr3[i + arr1.length] = arr2[i];
        }

        System.out.println("Mảng thứ 3 sau khi gộp lại là: " + Arrays.toString(arr3));

    }
}
