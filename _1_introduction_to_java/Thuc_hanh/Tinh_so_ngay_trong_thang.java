package _1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        int month;

        Scanner kb = new Scanner(System.in);
        System.out.println("Mời nhập số tháng: ");

        month = Integer.parseInt(kb.nextLine());

        if (month > 12 && month < 1) {
            System.out.println("Bạn đã nhập sai");
        } else {
            switch (month) {
                case 1:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 3:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 5:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 7:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 8:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 10:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày ");
                    break;
                case 4:
                    System.out.println("Tháng " + month + " có 30 ngày ");
                    break;

                case 6:
                    System.out.println("Tháng " + month + " có 30 ngày ");
                    break;
                case 9:
                    System.out.println("Tháng " + month + " có 30 ngày ");
                    break;
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày ");
                    break;
                case 2:
                    System.out.println("Tháng " + month + " có 28 hoặc 29 ngày ");
            }
        }
    }
}
