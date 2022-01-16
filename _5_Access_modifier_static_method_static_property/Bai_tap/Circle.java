package _5_Access_modifier_static_method_static_property.Bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
