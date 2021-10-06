import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraysTask {
    private static List<Integer> integers;

    public static List<Integer> getIntegers(int n) {
        if (integers == null || integers.size() != n)
            integers = createArray(n);
        return integers;
    }

    private static List<Integer> createArray(int size) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(100) + 1);
        }
        return integers;
    }

    public static List<Double> arithmeticMean30() {
        List<Double> result = new ArrayList<>();
        double sum = 0;
        double count = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 1 && integers.get(i) >= 30) {
                sum += integers.get(i);
                count++;
            }
        }
        result.add(sum/count);
        result.add(count);
        return result;
    }
    public static List<Double> arithmeticMean60() {
        List<Double> result = new ArrayList<>();
        double sum = 0;
        double count = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 31 && integers.get(i) >= 60) {
                sum += integers.get(i);
                count++;
            }
        }
        result.add(sum/count);
        result.add(count);
        return result;
    }
    public static List<Double> arithmeticMean100() {
        List<Double> result = new ArrayList<>();
        double sum = 0;
        double count = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 61 && integers.get(i) >= 100) {
                sum += integers.get(i);
                count++;
            }
        }
        result.add(sum/count);
        result.add(count);
        return result;
    }
}
