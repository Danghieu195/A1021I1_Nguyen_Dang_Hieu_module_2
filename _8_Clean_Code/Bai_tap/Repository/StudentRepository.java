package _8_Clean_Code.Bai_tap.Repository;

import _8_Clean_Code.Bai_tap.Model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[20];
    static {
        students[0] = new Student(1, "HieuND", "1997-05-19", 8);
        students[1] = new Student(2, "HongHN", "1997-09-11", 9);
        students[2] = new Student(3, "TuanNA", "1999-10-12", 10);
    }

    @Override
    public Student[] getAll() {
        return students;
    }
//
//    @Override
//    public void add(Student student) {
//        for ( int i = 0; i < students.length; i++) {
//            if ( students[i] == null) {
//                students[i] = student;
//                break;
//            }
//        }
//        System.out.println("Danh sách mới sau khi thêm là: ");
//        for ( Student studentAdd : students) {
//            if ( studentAdd == null) {
//                break;
//            }
//            System.out.println(studentAdd);
//        }
//    }
}
