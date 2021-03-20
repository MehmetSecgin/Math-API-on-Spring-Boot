package ee.taltech.calculator.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PowerOfUtil {
    public static List<Integer> powerOfFour(List<Integer> input) {

        if(input==null)
            return Collections.emptyList();

        return input.stream().map(e -> (int)Math.pow(e,4)).collect(Collectors.toList());
    }
}
