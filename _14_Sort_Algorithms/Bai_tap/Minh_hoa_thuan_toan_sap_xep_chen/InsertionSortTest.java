package _14_Sort_Algorithms.Bai_tap.Minh_hoa_thuan_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list size: ");
        int size = Integer.parseInt(sc.nextLine());

        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu " + (i + 1) + " la : ");
            list[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(" The list before sort: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        for ( int num : list) {
            System.out.print(num + " ");
        }

    }
}
