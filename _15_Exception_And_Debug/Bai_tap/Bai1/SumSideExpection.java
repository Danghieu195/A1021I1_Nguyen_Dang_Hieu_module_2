package _15_Exception_And_Debug.Bai_tap.Bai1;

public class SumSideExpection extends Exception {
    public SumSideExpection() {
        super("The sum of any two sides is greater than the other side!");
    }
}
