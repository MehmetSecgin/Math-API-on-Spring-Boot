package ee.taltech.calculator.dto;

import java.util.List;

public class CalculationResult {
    private Integer min;
    private Float averageOfPositives;
    private List<Integer> odds;
    private Integer sumOfOdds;
    private List<Integer> powerOfFour;

    public List<Integer> getPowerOfFour() {
        return powerOfFour;
    }
    public void setPowerOfFour(List<Integer> powerOfFour) {
        this.powerOfFour = powerOfFour;
    }
    public List<Integer> getOdds() {
        return odds;
    }
    public void setOdds(List<Integer> odds) {
        this.odds = odds;
    }
    public Integer getSumOfOdds() {
        return sumOfOdds;
    }
    public void setSumOfOdds(Integer sumOfOdds) {
        this.sumOfOdds = sumOfOdds;
    }
    public Integer getMin() {
        return min;
    }
    public void setMin(Integer min) {
        this.min = min;
    }
    public Float getAverageOfPositives() {
        return averageOfPositives;
    }
    public void setAverageOfPositives(Float averageOfPositives) {
        this.averageOfPositives = averageOfPositives;
    }
}