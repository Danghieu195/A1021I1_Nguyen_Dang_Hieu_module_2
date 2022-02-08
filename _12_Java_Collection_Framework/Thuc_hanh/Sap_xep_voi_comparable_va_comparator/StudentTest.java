package _12_Java_Collection_Framework.Thuc_hanh.Sap_xep_voi_comparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Hieu", 25, "Da Nang");
        Student student1 = new Student("Uyen", 24, "Quang Nam");
        Student student2 = new Student("Khanh", 26, "Hoa Khanh");
        Student student3 = new Student("Thien", 25, "Ho Chi Minh");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);

        for ( Student students : lists) {
            System.out.println(students.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);

        System.out.println("Sap xep theo tuoi ");
        for ( Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
