package _8_Clean_Code.Bai_tap.Service;

import _8_Clean_Code.Bai_tap.Model.Student;
import _8_Clean_Code.Bai_tap.Repository.IStudentRepository;
import _8_Clean_Code.Bai_tap.Repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);

    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void add() {
        System.out.println("Mời nhập mã số học sinh: ");
        int codeHocSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập tên học sinh: ");
        String nameHocSinh = sc.nextLine();
        System.out.println("Mời nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Mời nhập điểm học sinh: ");
        int point = Integer.parseInt(sc.nextLine());

        Student[] students = iStudentRepository.getAll();

        Student student1 = new Student(codeHocSinh, nameHocSinh, dateOfBirth, point);
       for ( int i = 0; i < students.length; i++) {
           if (students[i] == null) {
               students[i] = student1;
               break;
           }
       }
           System.out.println("Danh sách sau khi được thêm là: ");
            for (Student studentAdd : students) {
                if ( studentAdd == null) {
                    break;
                }
                System.out.println(studentAdd);
            }

    }

    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();
        for (Student student : students) {
            if ( student != null){
                System.out.println(student);
            }
        }

    }

    @Override
    public void delete() {
        System.out.println("Mời bạn nhập mã số học sinh cần xóa: ");
        int maSoHocSinh = Integer.parseInt(sc.nextLine());

        Student[] students = iStudentRepository.getAll();

        // int i = search(students, maSoHocSinh);
        for (int i = 0; i < students.length;i++) {
            if ( students[i].getCodeStudent() == maSoHocSinh) {
                students[i] = null;
                break;
            }
        }

//        for (; i < students.length; i++) {
//            if ( students[i].getCodeStudent() == maSoHocSinh) {
//                students[i+1] = students[i];
//            }
//        }
//        students[i -  1] = null;
    }

//    public int search(Student[] students, int code) {
//        boolean check = false;
//        int count = 0;
//        for ( int i = 0; i < students.length; i++) {
//            if ( students[i] == null) {
//                break;
//            }
//            if ( students[i].getCodeStudent() == code) {
//                check = true;
//                count = i;
//            }
//        }
//        if (!check) {
//            System.out.println("Không tìm thấy!!");
//        }
//        return count;
//    }
    }




