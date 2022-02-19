import _8_Clean_Code.Bai_tap.Model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student(1,"c","d",5));
        students.add(new Student(2,"a1","b1",1));

//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return  (int)(o1.getPoint()- o2.getPoint());
//            }
//        });
//
//        students.sort((o1,o2)-> (int)(o1.getPoint()- o2.getPoint()));

        students.sort(Comparator.comparing(Student::getNameStudent));

        students.stream().sorted();
        students.forEach(System.out::println);

//        List result = list.stream().sorted((o1, o2)->o1.getItem().getValue().
//                compareTo(o2.getItem().getValue())).
//                collect(Collectors.toList());

    }


}
