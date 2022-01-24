package _3_Array.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
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

        int x;
        int indexDel = 0;
        System.out.println("Mời nhập số cần xóa");
        x = Integer.parseInt(sc.nextLine());

        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] == x) {
                indexDel = i;
            }
        }

        for ( int i = indexDel; i < arr.length - 1; i++) {
            arr[i] =  arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        System.out.println("Mảng sau khi đã xóa là : " + Arrays.toString(arr));
//        for ( int i = 0; i < arr.length; i++) {
//            if (arr[i] == x ) {
//                int j;
//                if (i != arr.length - 1) {
//                    for (j = i + 1; j < arr.length; j++) { // xét số liền kề lúc tìm thấy số cần xóa
//                        arr[j - 1] = arr[j];
//                    }
//                    arr[j - 1] = 0; // gán số cuối cùng bằng 0
//                }
//            } else if ( arr[i] != x) {
//                System.out.println("Không tìm thấy số bạn cần xóa");
//            }
//        }
//        System.out.println("Mảng sau khi đã xóa là : " + Arrays.toString(arr));
    }
}
