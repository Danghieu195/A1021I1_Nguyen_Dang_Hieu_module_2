package _2_Loop_Statement.Bai_tap;

import java.util.Scanner;

public class Hien_thi_20_snt_dau_tien {
    public static void main(String[] args) {
        int numbers;
        System.out.println("Bạn muốn in bao nhiêu số nguyên tố: ");
        Scanner sc = new Scanner(System.in);
        numbers = Integer.parseInt(sc.nextLine());
        int count = 0;
        int i = 1;
        boolean check;

       while (count < numbers) {
           check = true;
           for ( int j = 2; j < i; j++) {
               if( i % j == 0) {
                   check = false;
               }
           }
           if (check){
               System.out.println(i);
               count++;
           }
           i++;
       }
    }
}
