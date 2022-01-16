package _1_introduction_to_java.Bai_tap;


import java.util.Scanner;

public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your name: ");

        name = sc.nextLine();

        System.out.println("Hello " + name);

    }
}
