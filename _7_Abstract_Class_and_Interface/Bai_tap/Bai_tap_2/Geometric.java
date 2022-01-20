package _7_Abstract_Class_and_Interface.Bai_tap.Bai_tap_2;

public abstract class Geometric {
    private String color;

    public Geometric() {
    }

    public Geometric (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

}
