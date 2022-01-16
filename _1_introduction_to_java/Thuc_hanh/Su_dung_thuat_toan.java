package _1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class Su_dung_thuat_toan {
    public static void main(String[] args) {
        int chieuDai;
        int chieuRong;

        Scanner kb = new Scanner(System.in);

        System.out.println("Mời bạn nhập chiều dài: " );
        chieuDai = Integer.parseInt(kb.nextLine());
        System.out.println("Mời bạn nhập chiều rộng: " );
        chieuRong = kb.nextInt();

        int dienTich = chieuDai * chieuRong;
        System.out.println("Diện tích hình chữ nhật là : " + dienTich);
    }
}
