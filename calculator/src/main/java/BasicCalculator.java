import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome! This is a basic calculator.");

        while (true) {
            System.out.println("Enter your first number: ");
            double num1 = reader.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = reader.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Enter the operation (1/2/3/4): ");
            int choice = reader.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by 0 not possible!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to run another calculation? (yes/no)");
            String anotherCalculation = reader.next();

            if (!anotherCalculation.equalsIgnoreCase("yes")) {
                break;
            }

        }
        reader.close();
    }
}
