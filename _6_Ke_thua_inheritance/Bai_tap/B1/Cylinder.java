package _6_Ke_thua_inheritance.Bai_tap.B1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return  (super.getArea() * 2) + (this.height * super.getPerimeter());
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return " A cyclinder with the height: " + this.height + " , which is a subclass of " + super.toString();
    }
}
