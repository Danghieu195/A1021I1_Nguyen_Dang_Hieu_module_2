package _7_Abstract_Class_and_Interface.Bai_tap;

public  class Circle extends HinhHoc implements Resizeable {
    private double radius;

    public Circle ( String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with a radius: " + this.radius + " and with the area: " + this.getArea()
                + " and " + super.toString();
    }

    @Override
    public void resizeable(double percent) {
        setRadius(this.getRadius() * (100  + percent) / 100);
    }

}
