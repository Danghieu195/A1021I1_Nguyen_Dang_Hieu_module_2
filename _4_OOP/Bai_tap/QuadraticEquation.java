package _4_OOP.Bai_tap;

public class QuadraticEquation {
     double a;
     double b;
     double c;
     double delta;
     double r1;
     double r2;
     double r3;

    public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = ( this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return r1 = (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public double getRoot2() {
        return r2 = (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
    }

    public double getRoot3() {
        return r3 = (-this.b) / (2 * this.a);

    }
}