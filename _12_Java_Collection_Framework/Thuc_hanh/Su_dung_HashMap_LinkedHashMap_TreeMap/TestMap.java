package _12_Java_Collection_Framework.Thuc_hanh.Su_dung_HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedHashMap;


public class TestMap {
    public static void main(String[] args) {
        // Tạo HashMap để lưu danh sách sinh viên
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hieu", 25);
        hashMap.put("Khanh", 30);
        hashMap.put("Hung", 26);
        hashMap.put("Thien", 31);
        System.out.println("Danh sách sinh viên theo kiểu HashMap: ");
        for ( Map.Entry<String, Integer> m: hashMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
//        System.out.println("Display entries in HashMap: ");
//        System.out.println(hashMap + "\n");
        System.out.println("--------------");
        System.out.println("--------------");


       // Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        System.out.println("Danh sách sinh viên theo kiểu TreeMap: ");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        for ( Map.Entry<String, Integer> m: treeMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //        System.out.println("Display entries in ascending order of key: ");
        //        System.out.println(treeMap);

        System.out.println("--------------");
        System.out.println("--------------");

       // Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ha", 30);
        linkedHashMap.put("Tuan", 31);
        linkedHashMap.put("Thuan", 29);
        linkedHashMap.put("Sy", 29);
        System.out.println("The age for " + " Thuan is : "+ linkedHashMap.get("Thuan"));
        System.out.println("The age for " + " Tuan is : "+ linkedHashMap.get("Tuan"));








//        System.out.println("Display entries in ascending order of key: ");
//        System.out.println(treeMap);
    }
}
