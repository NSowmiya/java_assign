import java.util.function.BiFunction;

public class Calculator {
    public static double calculate(double num1, double num2, String operator, BiFunction<Double, Double, Double> operation) {
        return operation.apply(num1, num2);
    }

    public static void main(String[] args) {
        // Example usage
        double operand1 = 10.0;
        double operand2 = 5.0;

        double resultAddition = calculate(operand1, operand2, "+", (a, b) -> a + b);
        System.out.println("Addition Result: " + resultAddition);

   
        double resultSubtraction = calculate(operand1, operand2, "-", (a, b) -> a - b);
        System.out.println("Subtraction Result: " + resultSubtraction);

        double resultMultiplication = calculate(operand1, operand2, "*", (a, b) -> a * b);
        System.out.println("Multiplication Result: " + resultMultiplication);
    }
}
