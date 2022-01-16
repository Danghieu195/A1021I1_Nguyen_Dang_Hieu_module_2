package _5_Access_modifier_static_method_static_property.Thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student std1 = new Student(111, "Hong Ha");
        Student std2 = new Student(222, "Huynh Sy");
        Student std3 = new Student(333, "Dang Hieu");

        std1.display();
        std2.display();
        std3.display();
    }
}

 class Student {
    private int stt;
    private String name;
    private static String nameSchool = " ";

    Student ( int numb, String n) {
        stt = numb;
        name = n;
    }

    static void change() {
        nameSchool = "GYMCODE";
    }

    void display() {
        System.out.println(stt + " " + name + " " + nameSchool);
    }
}
