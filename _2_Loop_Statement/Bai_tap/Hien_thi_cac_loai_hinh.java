package _2_Loop_Statement.Bai_tap;

import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {

    public static void main(String[] args) {
        int choice = -1;
        int input;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the triangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Print the triangel");
                    int chieuDai;
                    int chieuRong;
                    Scanner kb = new Scanner(System.in);
                    System.out.println("Mời nhập chiều dài: ");
                    chieuDai = Integer.parseInt(kb.nextLine());

                    System.out.println("Mời nhập chiều rộng: ");
                    chieuRong = Integer.parseInt(kb.nextLine());

                    for ( int i = 0; i < chieuDai; i++) {
                        for ( int j = 0; j < chieuRong; j++){
                            System.out.print(" * ");
                        }
                        System.out.println(); // In xuống dòng cho mỗi dòng
                    }
                    break;

                case 2:
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
                    for ( int i = 1; i <= 5; i++){
                        for ( int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    for(int i = 5; i >= 1; i--){
                        for(int j = 1; j <= i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("In hình tam giác cân");
                    for (int i = 1; i <= 5; i++) {

                        for ( int k = 5; k > i; k--){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.exit(4);
            }
        }
    }
}
