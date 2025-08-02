import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers and operator
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator (+, -, *, /): ");
        String operator = sc.next();

        // Call calculation method
        calculate(num1, num2, operator);

        sc.close(); // good practice to close Scanner
    }

    // Calculation logic
    public static void calculate(int num1, int num2, String operator) {
        switch (operator) {
            case "+" -> System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
            case "-" -> System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
            case "*" -> System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Division of " + num1 + " by " + num2 + " is " + (num1 / num2));
                }
            }
            default -> System.out.println("Invalid operator");
        }
    }
}
