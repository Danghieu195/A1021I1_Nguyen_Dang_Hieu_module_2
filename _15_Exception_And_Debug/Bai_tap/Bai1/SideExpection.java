package _15_Exception_And_Debug.Bai_tap.Bai1;

import java.util.Scanner;

public class SideExpection extends Exception {
    public SideExpection() {
        super ("The side of triangle is greater than zero");
    }
}
