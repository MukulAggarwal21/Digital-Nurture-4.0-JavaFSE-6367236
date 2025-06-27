package model;

public class ForecastInput {
    private double currentValue;
    private double growthRate;
    private int years;

    public ForecastInput(double currentValue, double growthRate, int years) {
        this.currentValue = currentValue;
        this.growthRate = growthRate;
        this.years = years;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public int getYears() {
        return years;
    }
}