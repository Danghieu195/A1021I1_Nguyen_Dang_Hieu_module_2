package _7_Abstract_Class_and_Interface.Bai_tap.Bai_tap_1;

public class Square extends HinhHoc implements Resizeable {
    private double edge;

    public Square ( String color, double edge) {
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
        return "A square with the edge = " + this.edge + " and the area is " + this.getArea()
                + " and " + super.toString();
    }

    @Override
    public void resizeable(double percent) {
        setEdge(this.getEdge() * ( 100  + percent ) / 100 );
    }
}
