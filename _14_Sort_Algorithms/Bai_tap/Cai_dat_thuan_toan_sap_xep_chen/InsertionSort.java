package _14_Sort_Algorithms.Bai_tap.Cai_dat_thuan_toan_sap_xep_chen;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 78, 65, 47, 21, 35, 4, 8, 100};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for ( int num : arr) {
            System.out.print(num + " ");
        }
    }
}
