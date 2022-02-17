package _14_Sort_Algorithms.Thuc_hanh.Minh_hoa_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortTest {
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

        boolean check = true;
        for (int i = 0; i < list.length; i++) {
            check = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    check = true;
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        System.out.println("The list after use bubble sort: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

    }
}
