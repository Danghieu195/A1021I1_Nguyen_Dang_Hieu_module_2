package _12_Java_Collection_Framework.Thuc_hanh.Phan_biet_HashMap_va_HashSet;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Hieu", 25, "Da Nang");
        Student student2 = new Student("Ha", 26, "Sai Gon");
        Student student3 = new Student("Tuan", 24, "Ha Noi");

        Map<Student, Integer> studentMap = new HashMap<Student, Integer>();
        studentMap.put(student1, 1);
        studentMap.put(student3, 3);
        studentMap.put(student2, 2);
        studentMap.put(student1, 4);
        for( Map.Entry<Student, Integer> std: studentMap.entrySet()){
            System.out.println(std.toString());
        }

//        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
//        studentMap.put(1, student1);
//        studentMap.put(3, student3);
//        studentMap.put(2, student2);
//        studentMap.put(4, student1);
//        for (Map.Entry<Integer, Student> std : studentMap.entrySet()) {
//            System.out.println(std.getKey() + " " + std.getValue());
//        }

    }
}
