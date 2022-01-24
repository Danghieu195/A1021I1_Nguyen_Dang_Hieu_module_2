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
        int indexAdd;
        System.out.println("Mời bạn nhập số cần chèn: ");
        x = Integer.parseInt(sc.nextLine());

        System.out.println("Bạn muốn chèn ở vị trí nào trong mảng? ");
        indexAdd = Integer.parseInt(sc.nextLine());

        if ( indexAdd < 0 || indexAdd > arr.length - 1 ) {
            System.out.println("Không thể chèn số vào trong mảng");
        } else {
            for ( int i = arr.length - 1; i > indexAdd; i-- ){
                 arr[i] = arr[i-1];
            }
            arr[indexAdd] = x;
        }
        System.out.println("Mảng của bạn sau khi chèn là: " + Arrays.toString(arr));

    }
}
