package ee.taltech.calculator.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CalculationResult {
    private Integer min;
    private Float averageOfPositives;
    private List<Integer> odds;
    private Integer sumOfOdds;
    private List<Integer> powerOfFour;

}
