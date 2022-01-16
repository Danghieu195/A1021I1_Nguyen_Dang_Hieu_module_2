package _2_Loop_Statement.Thuc_hanh;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập vào 1 số nguyên dương: ");
        int number = Integer.parseInt(sc.nextLine());
        if ( number < 2){
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if ( number % i == 0) {
                    check = false;
                    break;
                }
                 i++;
            }
            if (check) {
                System.out.println(number + " là số nguyên tố");
            } else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }

    }
}
