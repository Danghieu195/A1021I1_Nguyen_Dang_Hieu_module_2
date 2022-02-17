package _14_Sort_Algorithms.Thuc_hanh.Cai_dat_thuan_toan_sap_xep_chon;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {30, 44, 9, 10, 18, 78, 54, 8};
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
