import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^y)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    squareRoot();
                    break;
                case 2:
                    factorial();
                    break;
                case 3:
                    naturalLog();
                    break;
                case 4:
                    powerFunction();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }

    public static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + result);
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static void naturalLog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.log(num);
        System.out.println("Natural logarithm of " + num + " is " + result);
    }

    public static void powerFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}

