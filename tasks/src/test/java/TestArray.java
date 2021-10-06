import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArray {
    @Test
    void test30() {
        List<Double> result = ArraysTask.arithmeticMean30();
        assertEquals(4, result.get(1), "Кол-во превышено!");
    }

    @Test
    void test60() {
        List<Double> result = ArraysTask.arithmeticMean30();
        assertTrue(result.get(0) < 0, "Неправельное ср.арфм!");
    }
}
