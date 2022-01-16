package _7_Abstract_Class_and_Interface.Thuc_hanh.Practice_2;

import _6_Ke_thua_inheritance.Thuc_hanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

        public ComparableCircle() {
        }

        public ComparableCircle(double radius) {
            super(radius);
        }

        public ComparableCircle( String color, double radius, boolean filled) {
            super(color, filled, radius);
        }

        @Override
        public int compareTo(ComparableCircle o) {
            if (getRadius() > o.getRadius()) return 1;
            else if (getRadius() < o.getRadius()) return -1;
            else return 1;
        }
    }
