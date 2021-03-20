package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OddUtilTest {

    @Test
    @DisplayName("null or empty inputs return null result")
    void oddsEmptyInput() {
        assertNull(OddUtil.odds(null));
        assertNull(OddUtil.odds(List.of()));
    }

    @Test
    @DisplayName("null or empty inputs return null for Sum of Odds")
    void sumOfOddsNullAndEmptyInput(){
        assertNull(OddUtil.sumOfOdds(null));
        assertNull(OddUtil.sumOfOdds(List.of()));
    }


    @Test
    @DisplayName("finds odds and sums them up on valid input")
    void oddsAndSumOfOdsWorkNormally() {
        assertEquals(List.of(1,5), OddUtil.odds(List.of(1,-2,5)));
        assertEquals(6, OddUtil.sumOfOdds(List.of(1,-2,5)));
    }
}
