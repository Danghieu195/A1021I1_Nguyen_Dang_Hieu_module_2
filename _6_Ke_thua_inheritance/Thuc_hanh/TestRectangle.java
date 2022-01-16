package _6_Ke_thua_inheritance.Thuc_hanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        rectangle = new Rectangle("organe", true,2.3, 5.8);
        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
    }
}
