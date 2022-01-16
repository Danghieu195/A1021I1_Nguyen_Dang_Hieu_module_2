package _3_Array.Thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"A", "B", "C", "D"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tên học sinh cần tìm: ");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for ( int i = 0; i < students.length; i++) {
            if ( students[i].equals(inputName)){
                System.out.println("Tên học sinh " + inputName + " trong danh sách nằm ở vị trí " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy tên học sinh " + inputName + " trong danh sách");
        }
    }
}
