import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Java Calculator ===");

        // First number
        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid first number!");
            return;
        }
        double num1 = sc.nextDouble();

        // Operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Second number
        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid second number!");
            return;
        }
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
