package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MinUtilTest {
    @Test
    @DisplayName("null or empty inputs return null result")
    void oddsEmptyInput() {
        assertNull(MinUtil.min(null));
        assertNull(MinUtil.min(List.of()));
    }

    @Test
    @DisplayName("finds odds and sums them up on valid input")
    void oddsAndSumOfOdsWorkNormally() {
        assertEquals(-2, MinUtil.min(List.of(1,-2,5)));
        assertEquals(-5, MinUtil.min(List.of(1,-2,5,-5)));
    }
}