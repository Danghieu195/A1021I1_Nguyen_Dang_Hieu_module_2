package _2_Loop_Statement.Thuc_hanh;

import java.util.Scanner;

public class Tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập số a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập số b: ");
        b = Integer.parseInt(sc.nextLine());

        b = Math.abs(b); // giá trị tuyệt đối
        a = Math.abs(a);

        if ( a == 0 || b == 0) {
            System.out.println("Không có ước chung");
        }
        while (a != b) {
            if ( a > b)
                a = a - b;
            else
                b = b - a;
        }
    }
}
