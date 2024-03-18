package week3;

// Kelas induk
class CalculatorStandard {
    protected double num1;
    protected double num2;

    public CalculatorStandard(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // NaN (Not a Number) represents an undefined or unrepresentable value
        }
    }
}

// Kelas anak
class CalculatorScientific extends CalculatorStandard {
    public CalculatorScientific(double num1, double num2) {
        super(num1, num2);
    }

    public double power() {
        return Math.pow(num1, num2);
    }

    public double squareRoot() {
        return Math.sqrt(num1);
    }
}

public class Main {
    public static void main(String[] args) {
        CalculatorStandard standardCalc = new CalculatorStandard(10, 5);
        System.out.println("Addition: " + standardCalc.add()); // Output: 15.0
        System.out.println("Subtraction: " + standardCalc.subtract()); // Output: 5.0
        System.out.println("Multiplication: " + standardCalc.multiply()); // Output: 50.0
        System.out.println("Division: " + standardCalc.divide()); // Output: 2.0

        CalculatorScientific scientificCalc = new CalculatorScientific(9, 3);
        System.out.println("Addition: " + scientificCalc.add()); // Output: 12.0
        System.out.println("Power: " + scientificCalc.power()); // Output: 729.0 (9^3)
        System.out.println("Square Root: " + scientificCalc.squareRoot()); // Output: 3.0 (square root of 9)
    }
}
