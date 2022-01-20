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

    }

    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();
        for (Student student : students) {
            if ( student == null){
                break;
            }
            System.out.println(student);
        }

    }

    @Override
    public void delete() {
        System.out.println("Mời bạn nhập mã số học sinh cần xóa: ");
        int maSoHocSinh = Integer.parseInt(sc.nextLine());
        Student[] students = iStudentRepository.getAll();
        int dem = search(students, maSoHocSinh);
        int i = dem;

        for (; i < students.length; i++) {
            if ( students[i] == null) {
                students[i-1] = null;
                break;
            }
           students[i] = students[i+1];
        }
        System.out.println("Đã xóa học sinh " + students[dem].getNameStudent() + " ra khỏi danh sách");

        for ( Student student : students) {
            if (student == null) {
                break;
            }
            System.out.println(student);
        }

//       System.out.println("Danh sách học sinh sau khi xóa là: " + super.toString());
    }

    // viết phương thức search để tìm kiếm mã số sinh viên để xóa
    public static int search(Student[] students, int code) {

        boolean check = false;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if ( students[i] == null) {
                break;
            } if ( students[i].getCodeStudent() == code) {
                check = true;
                count = i;
            }

            if (!check) {
                System.out.println("Không tìm thấy học sinh có mã số " + code);
            }
            return count;
        }
        return count;
    }
}
