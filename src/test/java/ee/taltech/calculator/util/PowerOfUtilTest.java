package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PowerOfUtilTest {
    @Test
    @DisplayName("null or empty inputs return null result")
    void oddsEmptyInput() {
        assertNull(PowerOfUtil.powerOfFour(null));
        assertNull(PowerOfUtil.powerOfFour(List.of()));
    }

    @Test
    @DisplayName("finds odds and sums them up on valid input")
    void oddsAndSumOfOdsWorkNormally() {
        assertEquals(List.of(1,16,625), PowerOfUtil.powerOfFour(List.of(1,-2,5)));
        assertEquals(List.of(1,16,625,625), PowerOfUtil.powerOfFour(List.of(1,-2,5,-5)));
    }
}
