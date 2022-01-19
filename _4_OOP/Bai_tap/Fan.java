package _4_OOP.Bai_tap;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan (){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "Fan{" +
//                "SLOW=" + SLOW +
//                ", MEDIUM=" + MEDIUM +
//                ", FAST=" + FAST +
//                ", speed=" + speed +
//                ", on=" + on +
//                ", radius=" + radius +
//                ", color='" + color + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return this.getOn() ? " the fan is on with speed is " + this.getSpeed() + " and the color is " + this.getColor()
                + " and the radius is " + this.getRadius() : " the fan is on with speed is " + this.getSpeed() + " and the color is " + this.getColor()
                + " and the radius is " + this.getRadius();
    }
}
