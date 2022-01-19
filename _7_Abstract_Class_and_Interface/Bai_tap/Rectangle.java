package _7_Abstract_Class_and_Interface.Bai_tap;

public class Rectangle extends HinhHoc implements Resizeable  {
    private double width;
    private double length;

    public Rectangle ( String color, double width, double length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "A rectangle with the length = " + this.length + " ,the width = " + this.width + " and the area is " + this.getArea()
                + " and " + super.toString();
    }

    @Override
    public void resizeable(double percent) {
        setLength(this.getLength() * ( 100 + percent ) / 100);
        setWidth(this.getWidth() * ( 100 + percent ) / 100);
    }
}
