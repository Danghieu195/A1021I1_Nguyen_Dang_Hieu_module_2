package _7_Abstract_Class_and_Interface.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TestHinhHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số percent: ");
        double percent = Double.parseDouble(sc.nextLine());

        HinhHoc[] hinhHocs = new HinhHoc[3];
        hinhHocs[0] = new Circle("blue", 5.0);
        hinhHocs[1] = new Rectangle("white", 5.0, 10.0);
        hinhHocs[2] = new Square("yellow", 15.0);

        System.out.println("Pre-size");
        for ( HinhHoc hinhHoc : hinhHocs) {
            System.out.println(hinhHoc);
        }

        System.out.println("After - size: ");
        for ( HinhHoc hinhHoc : hinhHocs) {
            if ( hinhHoc instanceof Circle) {
                ((Circle)hinhHoc).resizeable(percent);
            }
            if ( hinhHoc instanceof Rectangle) {
                ((Rectangle)hinhHoc).resizeable(percent);
            }
            if ( hinhHoc instanceof Square) {
                ((Square)hinhHoc).resizeable(percent);
            }

            System.out.println(hinhHoc);
        }


    }
}
