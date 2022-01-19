package _7_Abstract_Class_and_Interface.Bai_tap.Bai_tap_1;

public abstract class HinhHoc {
    private String color;

    public HinhHoc(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "A shape with color of " + this.color;
    }
}
