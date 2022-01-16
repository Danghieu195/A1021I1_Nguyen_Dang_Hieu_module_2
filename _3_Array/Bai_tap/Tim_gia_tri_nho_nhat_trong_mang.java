package _3_Array.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;

        System.out.print("Bạn muốn bao nhiêu phần tử trong mảng: ");
        size = Integer.parseInt(sc.nextLine());

        arr = new int[size];
        for ( int i = 0; i < size; i++) {
            System.out.print("Mời bạn nhập phần tử thứ " + (i + 1)+ ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng bạn vừa nhập có các phần tử là: " + Arrays.toString(arr));

        int index = minValue(arr);
        System.out.println("Số nhỏ nhất trong mảng bạn vừa nhập là: " + arr[index]);

    }
    public static int minValue(int[] array) {
        int index = 0;
        for ( int i = 0; i < array.length; i++) {
            if( array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
