package _7_Abstract_Class_and_Interface.Thuc_hanh.Practice_3;

import _6_Ke_thua_inheritance.Thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()){
            return -1;
        }
        else return 0;
        }
}
