package _2_Loop_Statement.Thuc_hanh;

import java.util.Scanner;

public class Tinh_tien_lai_gui_ngan_hang {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        double totalInterest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập số tiền gửi (triệu): ");
        money = Double.parseDouble(sc.nextLine());

        System.out.println("Mời nhập số tháng mà bạn muốn gửi: ");
        month = Integer.parseInt(sc.nextLine());

        System.out.println("Mời nhập lãi suất (%): ");
        interestRate = Double.parseDouble(sc.nextLine());

        for ( int i = 0; i < month; i++) {
            totalInterest = money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng số tiền lãi là : " + totalInterest);
    }
}
