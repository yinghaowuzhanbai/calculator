package org.example;

public class Calculator {
    // Stores the current result of the calculations
    private Number result;
    // Constructor initializes the calculator with an initial value
    public Calculator(Number initialValue) {
        this.result = initialValue;
    }

    public Calculator apply(Operation op, Number value) {
        this.result = calculate(op, this.result, value);
        return this;
    }

    public Number getResult() {
        return result;  // support method chaining
    }

    public Number calculate(Operation op, Number num1, Number num2) {
        switch (op) {
            case ADD:
                return num1.doubleValue() + num2.doubleValue();
            case SUBTRACT:
                return num1.doubleValue() - num2.doubleValue();
            case MULTIPLY:
                return num1.doubleValue() * num2.doubleValue();
            case DIVIDE:
                if (num2.doubleValue() == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return num1.doubleValue() / num2.doubleValue();
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + op);
        }
    }
}
