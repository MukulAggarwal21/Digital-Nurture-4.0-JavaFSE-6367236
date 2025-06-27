package service;

import model.ForecastInput;

public class ForecastCalculator {

    public double calculateRecursive(ForecastInput input) {
        return calculateRecursive(input.getCurrentValue(), input.getGrowthRate(), input.getYears());
    }

    private double calculateRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return calculateRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public double calculateMemoized(ForecastInput input) {
        double[] memo = new double[input.getYears() + 1];
        return calculateMemoized(input.getCurrentValue(), input.getGrowthRate(), input.getYears(), memo);
    }

    private double calculateMemoized(double currentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = calculateMemoized(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}