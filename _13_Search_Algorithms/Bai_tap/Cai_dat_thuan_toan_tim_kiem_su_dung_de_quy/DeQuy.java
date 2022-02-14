package _13_Search_Algorithms.Bai_tap.Cai_dat_thuan_toan_tim_kiem_su_dung_de_quy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DeQuy {
    public static Scanner sc = new Scanner(System.in);
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        // Bước 1: Khởi tạo một mảng bất kì với các giá trị nhập vào từ bàn phím
        System.out.println("Enter a size of array you want: ");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 20));
        }
        System.out.println("Array before sort: " + list);
        list.sort((o1, o2) -> o1 - o2);

        // Bước 2: Sắp xếp giá trị từ nhỏ tới lớn
        System.out.println("Array after sort: " + list);
    }
}
