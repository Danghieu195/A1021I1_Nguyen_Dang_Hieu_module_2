package _15_Exception_And_Debug.Bai_tap.Bai1;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) throws SideExpection, SumSideExpection {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new SideExpection();
        } else {
            if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
                throw new SumSideExpection();
            } else {
                System.out.println("Your triangle is successfully create with 3 sides are: " + side1 + ", " + side2 + ", " + side3 + " consecutively!");

            }
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter side 2: ");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter side 3: ");
        double side3 = Double.parseDouble(sc.nextLine());

        try {
            Triangle triangle = new Triangle(side1,side2,side3);
        } catch (SideExpection e) {
            System.out.println("The side of triangle is greater than zero");
        } catch (SumSideExpection e) {
            System.out.println("The sum of any two sides is greater than the other side!");
        }
    }
}
