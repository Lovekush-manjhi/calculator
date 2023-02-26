import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /) or 'q' to quit: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Exiting calculator program...");
                break;
            }

            double result;

            switch(operator) {
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
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
