package _1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class Tinh_chi_so_BMI {
    public static void main(String[] args) {

        double canNang;
        double chieuCao;
        double bmi;
        String input;

        Scanner kb = new Scanner(System.in);

        System.out.print("Xin mời nhập cân nặng : ");
        canNang = Double.parseDouble(kb.nextLine());

        System.out.print("Xin mời nhập chiều cao : ");
        chieuCao = Double.parseDouble(kb.nextLine());


        bmi = canNang / Math.pow(chieuCao, 2); // Math.pow(x,2) công thức tính căn bậc 2.

        System.out.println("Chỉ số BMI bạn vừa nhập là: " + bmi);

        if (bmi < 18) {
            System.out.println("Chỉ số " + bmi + " là underweight");
        } else if ( bmi < 25.0) {
            System.out.println("Chỉ số " + bmi + " là normal");
        } else if ( bmi < 30.0) {
            System.out.println("Chỉ số " + bmi + " là overweight");
        } else {
            System.out.println("Chỉ số " + bmi + " là obese");
        }
    }
}
