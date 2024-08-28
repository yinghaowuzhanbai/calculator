# Flexible Calculator

This project is a simple yet extensible calculator implemented in Java. It adheres to the Open-Closed Principle by using the strategy pattern for operations.

## Design Decisions

- The `Calculator` class is designed to allow easy addition of new operations without modifying the existing codebase.
- Operations are defined as enums with embedded strategies to perform calculations.
- The calculator supports chaining operations for more complex calculations.
- IoC compatibility is achieved by constructor injection.

## Assumptions

- Division by zero throws an `ArithmeticException`.
- Operations are performed on `Number` types, allowing both integer and floating-point operations.

## How to Run

1. Clone the repository.
2. Run `CalculatorTest` for unit tests using JUnit.
3. Use the `Calculator` class in your main program to perform calculations.