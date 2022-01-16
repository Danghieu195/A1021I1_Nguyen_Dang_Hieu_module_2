package _2_Loop_Statement.Bai_tap;

import java.util.Scanner;

public class Hien_thi_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
       int count = 0;
       boolean check = true;

       for ( int i = 2; i <= 100; i++) {
           check = true;
           for (int j = 2; j <= Math.sqrt(i); j++) {
               if ( i % j == 0) {
                   check = false;
                   break;
               }
           }
           if (check) {
               count++;
               System.out.println(i);
           }
       }
        System.out.println("Có " + count + " trong khoảng từ 2 - 100");

    }
}
