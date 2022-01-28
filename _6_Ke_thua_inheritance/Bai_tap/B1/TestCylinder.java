package _6_Ke_thua_inheritance.Bai_tap.B1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0,5.0,"Black");
        System.out.println(cylinder);
        System.out.println("The area is:  " + cylinder.getArea() + " and the volume is: " + cylinder.getVolume());
    }
}
