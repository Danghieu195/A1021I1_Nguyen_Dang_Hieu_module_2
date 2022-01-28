package _6_Ke_thua_inheritance.Bai_tap.B2;

public class Point3D extends Point2D{
    private float z;

    public Point3D () {
        this.z = 0.0f;
    }

    public Point3D(float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ( float x, float y, float z) {
        this.z = z;
        super.setXY(x,y);
    }

    public float[] getXYZ(){
        float[] arr = {super.getX(), super.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "The coordianates of Point3D is (" + super.getX() + "," + super.getY() + "," + this.getZ() + ")";
    }
}
