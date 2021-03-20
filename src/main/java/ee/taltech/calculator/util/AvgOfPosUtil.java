package ee.taltech.calculator.util;

import java.util.List;
import java.util.stream.Collectors;

public class AvgOfPosUtil {
    public static Double avgOfPositives(List<Integer> input) {
        if (input == null || input.isEmpty())
            return null;

        input = input
                .stream()
                .filter(i -> i > 0)
                .collect(Collectors.toList());

        return (double) Math.round(input
                .stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0));
    }
}
