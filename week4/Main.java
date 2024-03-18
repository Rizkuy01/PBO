package week4;

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Overloading example
        int resultInt = calculator.add(5, 3);
        double resultDouble = calculator.add(5.5, 3.3);

        System.out.println("Addition (int): " + resultInt);
        System.out.println("Addition (double): " + resultDouble);

        // Overriding example
        CalculatorAdvanced advancedCalculator = new CalculatorAdvanced();
        System.out.println("Square of 5: " + advancedCalculator.square(5));
    }
}

class CalculatorAdvanced extends Calculator {
    // Overriding the add method to square the input
    @Override
    public int add(int num1, int num2) {
        return num1 * num1 + num2 * num2;
    }

    // Adding a new method to calculate square
    public int square(int num) {
        return num * num;
    }
}
