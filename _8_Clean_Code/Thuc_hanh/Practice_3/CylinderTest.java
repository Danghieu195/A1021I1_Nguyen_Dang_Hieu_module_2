package _8_Clean_Code.Thuc_hanh.Practice_3;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0,0)")
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expect = 0;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Testing getVolume(1,2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expect = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expect, result);
    }
}
