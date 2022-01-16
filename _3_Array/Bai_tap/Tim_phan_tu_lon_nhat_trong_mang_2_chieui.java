package _3_Array.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_phan_tu_lon_nhat_trong_mang_2_chieui {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[3][3];
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for ( int row = 0; row < matrix.length; row++){
            for ( int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int max;
        max = maxValue(matrix);
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều là: " + matrix[max]);

    }
    public static int maxValue(int[][] array) {
        int max = array[0][0];
        for( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                if ( array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
