package _6_Ke_thua_inheritance.Thuc_hanh;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override // Phương thức ghi đè của lớp con
    public String toString(){
        return "A circle  with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}

