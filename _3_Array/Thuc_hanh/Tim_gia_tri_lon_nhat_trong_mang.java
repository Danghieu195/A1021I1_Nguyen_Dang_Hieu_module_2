package _3_Array.Thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_gia_tri_lon_nhat_trong_mang {
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
        int max = arr[0];
        int index = 1;
        for ( int j = 0; j < arr.length; j++){
            if ( arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("Số lớn nhất trong mảng bạn vừa nhập là : " + max + " ở vị trí số " + index);
    }


}
