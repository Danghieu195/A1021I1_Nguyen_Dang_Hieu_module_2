package _3_Array.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        System.out.println("Bạn muốn nhập bao nhiêu số: ");
        size = Integer.parseInt(sc.nextLine());

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mời nhận nhập số thứ " + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng bạn vừa nhập là: " + Arrays.toString(arr));

        int x; // biến x là số cần chèn

        System.out.println("Mời bạn nhập số cần chèn: ");
        x = Integer.parseInt(sc.nextLine());
        int deleValue = 2;
        for( int i = x; i > deleValue; i--) {
            arr[i] = arr[i -1];
        }
        arr[deleValue] = x;
        System.out.println("Mảng của bạn sau khi chèn là: " + Arrays.toString(arr));
    }
}
