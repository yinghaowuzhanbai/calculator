package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a Calculator object with an initial value of 5
        Calculator calculator = new Calculator(5);

        // Perform a series of operations: add 3, then multiply by 2
        Number result = calculator.apply(Operation.ADD, 3)
                .apply(Operation.MULTIPLY, 2)
                .getResult();

        // Print the result
        System.out.println("The result of the calculation is: " + result); // Expected output: 16.0

        // Perform another calculation: subtract 2 and then divide by 3
        calculator = new Calculator(10);
        result = calculator.apply(Operation.SUBTRACT, 2)
                .apply(Operation.DIVIDE, 3)
                .getResult();

        // Print the result
        System.out.println("The result of the second calculation is: " + result); // Expected output: 2.6666...
    }
}