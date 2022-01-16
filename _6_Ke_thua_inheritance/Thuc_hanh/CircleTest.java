package _6_Ke_thua_inheritance.Thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("black", false, 5.5);
        System.out.println(circle);
        System.out.println( "The area with radius =  " + circle.getRadius() + " is " + circle.getArea());
    }
}
