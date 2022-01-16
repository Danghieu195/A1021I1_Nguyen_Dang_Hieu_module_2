package _3_Array.Thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_trong_mang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mời bạn nhập số thứ " + ( i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println( "Mảng bạn vừa nhập là: " + Arrays.toString(arr));

        int index = minValue(arr);
        System.out.println("Số nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for ( int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
