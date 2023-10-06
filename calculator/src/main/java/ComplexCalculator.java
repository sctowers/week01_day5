import java.util.Scanner;

public class ComplexCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome! This is an advanced calculator.");

        while (true) {
            System.out.println("Enter your first number: ");
            double num1 = getValidDoubleInput(reader);

            System.out.print("Enter your second number: ");
            double num2 = getValidDoubleInput(reader);

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Square Root");
            System.out.print("Enter the operation (1/2/3/4/5/6): ");
            int choice = getValidChoice(reader, 1, 6);

            double result = 0;

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
                case 5:
                    result = Math.pow(num1, num2);
                    break;
                case 6:
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: Square root of a negative number not possible!");
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

    // Helper method to get a valid double input from the user
    private static double getValidDoubleInput(Scanner reader) {
        double value;
        while (true) {
            try {
                value = reader.nextDouble();
                break; // Break the loop if a valid double is entered
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                reader.next(); // Clear the invalid input
            }
        }
        return value;
    }

    // Helper method to get a valid choice within a specified range
    private static int getValidChoice(Scanner reader, int min, int max) {
        int choice;
        while (true) {
            try {
                choice = reader.nextInt();
                if (choice >= min && choice <= max) {
                    break; // Break the loop if a valid choice is entered
                } else {
                    System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                reader.next(); // Clear the invalid input
            }
        }
        return choice;
    }
}



