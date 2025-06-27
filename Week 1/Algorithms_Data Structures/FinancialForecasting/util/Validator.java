package util;

public class Validator {
    public static boolean isValid(double currentValue, double growthRate, int years) {
        return currentValue >= 0 && growthRate >= 0 && years >= 0 && growthRate <= 1.0;
    }
}