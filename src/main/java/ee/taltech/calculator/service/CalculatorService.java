package ee.taltech.calculator.service;


import ee.taltech.calculator.dto.CalculationResult;
import ee.taltech.calculator.util.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {


    public CalculationResult calculate1(List<Integer> input) {
        CalculationResult result = new CalculationResult();
        result.setSumOfOdds(OddUtil.sumOfOdds(input));
        result.setMin(MinUtil.min(input));
        result.setPowerOfFour(PowerOfUtil.powerOfFour(input));
        return result;
    }

    public CalculationResult calculate2(List<Integer> input) {
        CalculationResult result = new CalculationResult();
        result.setOdds(OddUtil.odds(input));
        result.setSumOfOdds(OddUtil.sumOfOdds(input));
        result.setAverageOfPositives(AvgOfPosUtil.avgOfPositives(input));
        return result;
    }
}
