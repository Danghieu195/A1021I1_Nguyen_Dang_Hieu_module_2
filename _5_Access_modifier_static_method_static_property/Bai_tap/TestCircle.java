package _5_Access_modifier_static_method_static_property.Bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The radius is " + circle1.getRadius() + " and the area is " + circle1.getArea());
        Circle circle2 = new Circle(5);
        System.out.println("The radius is " + circle2.getRadius() + " and the area is " + circle2.getArea());
    }
}
