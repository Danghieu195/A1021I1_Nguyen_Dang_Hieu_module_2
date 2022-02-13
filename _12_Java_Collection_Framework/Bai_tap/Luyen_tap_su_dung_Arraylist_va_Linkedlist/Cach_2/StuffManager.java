package _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_2;

import _12_Java_Collection_Framework.Bai_tap.Luyen_tap_su_dung_Arraylist_va_Linkedlist.Cach_1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StuffManager {
    Scanner sc = new Scanner(System.in);
    // Tạo danh sách List cho lớp Stuff
    private static List<Stuff> stuffs = new ArrayList<>();

    // Tạo phương phức create để tạo mới 1 sản phẩm với Id tăng dần từ 0
    public void create(Stuff stuff) {
        stuff.setId(stuffs.size() + 1);
        stuffs.add(stuff);
    }

    // Tạo phương thức getAll để trả về danh sách stuffs
    public List<Stuff> getAll() {
        return stuffs;
    }

    //Tạo phương thức save để add vào trong danh sách List stuffs
    public void save(Stuff stuff) {
        if (stuff.getId() > 0) {
            int index = stuffs.indexOf(stuff);
            stuffs.set(index, stuff);
        } else {
            stuff.setId(stuffs.size() + 1);
            stuffs.add(stuff);
        }
    }

    // Tạo phương thức search() để hiển thị ra các tên sản phẩm có liên quan
    public List<Stuff> search(String name) {
//        List<Stuff> result = new ArrayList<>();
//        for (int i = 0; i < stuffs.size(); i++) {
//            if (stuffs.get(i).getName().contains(name)) {
//                stuffs.add(stuffs.get(i));
//            }
//        }
//        return result;

        // Thuộc tính contains(name) để tìm ra những sản phẩm có kí tự giống với người dùng cần tìm
      return stuffs.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }


}
