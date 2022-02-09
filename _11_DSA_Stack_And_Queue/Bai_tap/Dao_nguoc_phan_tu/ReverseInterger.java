package _11_DSA_Stack_And_Queue.Bai_tap.Dao_nguoc_phan_tu;


import java.util.Scanner;
import java.util.Stack;

public class ReverseInterger {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the array: ");
        int capacity = Integer.parseInt(sc.nextLine());
        int[] arr = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println("Before reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        System.out.println("\n After reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(stack.pop() + "\t");
        }


    }
}
