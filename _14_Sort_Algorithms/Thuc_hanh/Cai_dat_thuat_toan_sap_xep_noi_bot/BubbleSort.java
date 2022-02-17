package _14_Sort_Algorithms.Thuc_hanh.Cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {25, 12, 5, 1, 20, 34, 9, 10};
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            check = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    check = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
