package ee.taltech.calculator.util;

import java.util.List;
import java.util.stream.Collectors;

public class OddUtil {

    public static List<Integer> odds(List<Integer> input) {
        if (input.isEmpty())
            return null;
        return input
                .stream()
                .filter(i -> (i % 2 != 0))
                .collect(Collectors.toList());
    }

    public static Integer sumOfOdds(List<Integer> input) {
        if (input.isEmpty())
            return null;

        return odds(input)
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
