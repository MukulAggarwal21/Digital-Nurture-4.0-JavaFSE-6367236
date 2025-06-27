import model.ForecastInput;
import service.ForecastCalculator;
import util.Validator;
import analysis.ComplexityAnalysis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.10 for 10%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        if (!Validator.isValid(currentValue, growthRate, years)) {
            System.out.println("Invalid input. Make sure all values are non-negative and growth rate <= 1.0");
            return;
        }

        ForecastInput input = new ForecastInput(currentValue, growthRate, years);
        ForecastCalculator calculator = new ForecastCalculator();

        double resultRecursive = calculator.calculateRecursive(input);
        double resultMemoized = calculator.calculateMemoized(input);

        System.out.printf("\nFuture Value (Recursive): %.2f\n", resultRecursive);
        System.out.printf("Future Value (Memoized): %.2f\n", resultMemoized);

        ComplexityAnalysis.printAnalysis();
        scanner.close();
    }
}
