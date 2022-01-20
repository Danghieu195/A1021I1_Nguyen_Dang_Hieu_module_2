package _7_Abstract_Class_and_Interface.Bai_tap.Bai_tap_2;

public class Square extends Geometric implements Colorable {
    private double edge;

    public Square() {
        this.edge = 1.0;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public String toString() {
        return "A square with the edge: " + this.edge + " and the area: " + this.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color " + super.getColor() + " all four sides");
    }
}
