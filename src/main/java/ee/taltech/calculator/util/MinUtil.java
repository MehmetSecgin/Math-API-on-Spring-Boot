package ee.taltech.calculator.util;

import java.util.Comparator;
import java.util.List;

public class MinUtil {

    public static Integer min(List<Integer> input) {
        return input.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
    }
}
