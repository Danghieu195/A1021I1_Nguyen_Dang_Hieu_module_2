package _6_Ke_thua_inheritance.Bai_tap.B3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2,3);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2,5,2,3);
        System.out.println(movablePoint);
    }
}
