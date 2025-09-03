import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Sum: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Difference: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Product: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Quotient: " + result);
            } else {
                System.out.println("Error! Division by zero.");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
