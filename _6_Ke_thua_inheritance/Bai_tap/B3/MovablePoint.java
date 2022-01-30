package _6_Ke_thua_inheritance.Bai_tap.B3;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed ( float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed () {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public MovablePoint move(){
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "The coodinates of the point is ( " + super.getX() + "," + super.getY() + ")"
                + " and the speed is (" + this.getxSpeed() + "," + this.getySpeed() + ")"
                + " after moving, the new coodinates is (" + (super.getX() + this.getxSpeed()) + ","
                + (super.getY() + this.getySpeed()) + ")";
    }
}
