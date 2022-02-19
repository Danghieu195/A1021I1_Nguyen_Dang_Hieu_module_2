package _15_Exception_And_Debug.Thuc_hanh.Su_dung_lop_ArrayIndexOfBoundsException;

import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Integer[] arr = new Integer[50];
        System.out.println("Danh sách các phần tử của mảng là : ");
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*51);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số bất kỳ: ");
        int input = Integer.parseInt(sc.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + input + " là " + arr[input]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
