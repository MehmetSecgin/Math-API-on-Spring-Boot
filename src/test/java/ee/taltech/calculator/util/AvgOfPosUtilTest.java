package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AvgOfPosUtilTest {
    @Test
    @DisplayName("null or empty inputs return null result")
    void oddsEmptyInput() {
        assertNull(AvgOfPosUtil.avgOfPositives(null));
        assertNull(AvgOfPosUtil.avgOfPositives(List.of()));
    }

    @Test
    @DisplayName("finds odds and sums them up on valid input")
    void oddsAndSumOfOdsWorkNormally() {
        assertEquals(3, AvgOfPosUtil.avgOfPositives(List.of(1,-2,5)));
        assertEquals(4, AvgOfPosUtil.avgOfPositives(List.of(1,-2,5,7)));
    }
}
