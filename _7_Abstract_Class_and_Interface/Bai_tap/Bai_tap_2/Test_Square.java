package _7_Abstract_Class_and_Interface.Bai_tap.Bai_tap_2;

public class Test_Square {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[2];
        geometrics[0] = new Square(5.5);
        geometrics[1] = new Square("red", 10.5);

        for ( Geometric geometric : geometrics) {
            System.out.println(geometric);
            if ( geometric instanceof Square) {
                if ((geometric).getColor() != null) {
                    ((Square)geometric).howToColor();
                }else {
                    System.out.println("No color");
                }
            }
        }
    }
}
