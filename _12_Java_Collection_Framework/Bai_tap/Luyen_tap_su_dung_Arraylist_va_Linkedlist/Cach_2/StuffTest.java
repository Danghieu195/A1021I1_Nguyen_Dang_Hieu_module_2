package _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_2;

import _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_1.ProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StuffTest {
    private static Scanner sc = new Scanner(System.in);

    private static StuffManager stuffManager = new StuffManager();

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("1. Creat product\n2. Update product\n3. Delete a product\n" +
                    "4. Display list product\n5. Search by name\n6. Sort by price\n7. Exit");
            do {
                System.out.println("Input your choose: ");
                choose = Integer.parseInt(sc.nextLine());
            } while (choose > 7 || choose < 0);
            switch (choose) {
                case 1:
                    create();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Please input the name to search: ");
                    String name = sc.nextLine();
                    List<Stuff> stuffList = new StuffManager().search(name);
                    for (int i = 0; i < stuffList.size(); i++) {
                        System.out.println(stuffList.get(i));
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }

    private static void create() {
        inputSave(0);
        System.out.println("Create sucessfull!!!");
    }

    // Tạo phương phức inputSave để cho người dùng nhập dữ liệu từ bàn phím và lưu lại
    private static void inputSave(int id) {
        System.out.println("Name of stuff: ");
        String name = sc.nextLine();
        System.out.println("Price of stuff: ");
        Double price = Double.parseDouble(sc.nextLine());
        Stuff stuff = new Stuff(id, name, price);
        stuffManager.save(stuff);
    }

    // Tạo phương thức display để hiển thị ra danh sách
    private static void display() {
//        List<Stuff> stuffList = stuffManager.getAll();
//        for ( int i = 0; i < stuffList.size(); i++) {
//            System.out.println(stuffList.get(i)); // Phương thức get() là lấy ra
//    }
        stuffManager.getAll().forEach(System.out::println);
    }


}
