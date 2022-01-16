package _4_OOP.Thuc_hanh;

import java.util.Scanner;

public class Main_HCN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chiều rộng: ");
        double width =  Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập chiều dài: ");
        double height =  Double.parseDouble(sc.nextLine());

        hinhChuNhat hcn = new hinhChuNhat(width, height);
        System.out.println(hcn.display());
        System.out.println("Chu vi hình chữ nhật là: " + hcn.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + hcn.getArea());
    }
}
