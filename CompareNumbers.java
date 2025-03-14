package calculus;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input values for a and b
            System.out.print("Enter the first number (a): ");
            double a = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter the second number (b): ");
            double b = Double.parseDouble(scanner.nextLine());
            
            // Compare the numbers
            if (a < b) {
                System.out.println("The number 'a' (" + a + ") is lesser than 'b' (" + b + ").");
            } else if (a > b) {
                System.out.println("The number 'b' (" + b + ") is lesser than 'a' (" + a + ").");
            } else {
                System.out.println("Both numbers are equal.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Always close the scanner resource
        }
    }
}