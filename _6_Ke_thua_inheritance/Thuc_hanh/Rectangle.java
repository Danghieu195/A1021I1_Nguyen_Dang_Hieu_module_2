package _6_Ke_thua_inheritance.Thuc_hanh;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle( String color, boolean filled, double width, double length) {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " width = " + getWidth() +
                ", length = " + getLength() +
                ", which is a subclass of " +
                super.toString() +
                '}';
    }
}
