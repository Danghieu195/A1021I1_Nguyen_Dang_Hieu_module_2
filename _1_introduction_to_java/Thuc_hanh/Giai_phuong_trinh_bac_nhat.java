package _1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        float x;

        Scanner kb = new Scanner(System.in);

        System.out.println("Mời nhập số a: ");
        a = Integer.parseInt(kb.nextLine());
        System.out.println("Mời nhập số b: ");
        b = Integer.parseInt(kb.nextLine());

        if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (a == 0 && b == 0) {
            System.out.println("Phương tình vô số nghiệm");
        } else {
            x = -b / a;
            System.out.println("Phương trình có nghiệm là:\n X =  " + x);
        }
    }

}
