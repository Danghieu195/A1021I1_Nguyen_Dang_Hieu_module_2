package _4_OOP.Bai_tap;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation quadraticEquation =  new QuadraticEquation(a, b, c);

        if ( quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else if ( quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + quadraticEquation.getRoot3());
        } else {
            System.out.println("Phương trình không có nghiệm");
        }
    }
}
