import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalc {
    @Test
    void testPlus() {
        assertEquals(1.8 + 6, Calculation.plus(1.8, 6), "Непраильно прибавляет!!!!!");
    }

    @Test
    void testMinus() {
        assertEquals(1.8 - 6, Calculation.minus(1.8, 6), "Непраильно отнимает!!!!!");
    }

    @Test
    void testDivide() {
        double n = 1.8;
        double m= 0;
        assertTrue(m!=0, "На ноль делить нельзя!!!");
        assertEquals(n / m , Calculation.divide(n, m), "Непраильно делит!!!!!");
    }

    @Test
    void testIncrease() {
        assertEquals(1.8 * 6, Calculation.increase(1.8, 6), "Непраильно умножает!!!!!");
    }
}
