package _1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class Tinh_so_nam_nhuan {
    public static void main(String[] args) {
        int year;
        System.out.println("Mời bạn nhập số vào số năm: ");
        Scanner kb = new Scanner(System.in);

        year = Integer.parseInt(kb.nextLine());

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Là năm nhuận");
                } else {
                    System.out.println(year + " Không phải là năm nhuận");
                }
            } else {
                System.out.println(year + " Là năm nhuận");
            }
        } else {
            System.out.println(year + " Không phải là năm nhuận");
        }
    }
}
