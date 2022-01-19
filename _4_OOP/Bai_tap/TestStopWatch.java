package _4_OOP.Bai_tap;

import java.util.Arrays;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        //Gọi phương thức Start time
        stopWatch.start();
        System.out.println("Start Time is: " + stopWatch.getStartTime());

        // Tạo mảng chạy 100000 số
        int[] arr = new int[100000];

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100000);
        }
            selectionSort(arr);

        //Gọi phương thức endtime
        stopWatch.stop();
        System.out.println("End time is: " + stopWatch.getEndTime());

        // Gọi phương thức getElapsedTime để tính số giây đã trôi
        stopWatch.getElapsedTime();
        System.out.println("Elapsed time is: " + stopWatch.getElapsedTime());
    }

    private static void selectionSort(int[] arr) {
        Arrays.sort(arr);
        for ( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
