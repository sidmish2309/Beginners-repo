import java.util.Scanner;

public class main {

    /**
     * Main method to read three numbers and perform calculations.
     */
    public static void main(String[] args) {
        // --- Setup and Input ---
        System.out.println("Please enter three numbers (integers): ");
        Scanner sc = new Scanner(System.in);

        // Read the three integers from the user
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close(); // It's good practice to close the Scanner object

        // --- Functionality: Finding Largest ---
        int largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);

        // --- Functionality: Finding Smallest ---
        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);

        // --- Functionality: Calculating Average ---
        double average = calculateAverage(num1, num2, num3);
        // Using String.format to display the average with two decimal places
        System.out.println("The average of the numbers is: " + String.format("%.2f", average));
    }

    // ------------------------------------------
    // New Helper Methods for Added Functionality
    // ------------------------------------------

    /**
     * Finds the largest of three integers.
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return The largest integer.
     */
    public static int findLargest(int a, int b, int c) {
        // Your original logic, encapsulated in a method
        int larg = a;
        if (b > larg) {
            larg = b;
        }
        if (c > larg) {
            larg = c;
        }
        return larg;

        // Alternatively, using the Math.max method (more concise):
        // return Math.max(a, Math.max(b, c));
    }

    // ---
    
    /**
     * Finds the smallest of three integers.
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return The smallest integer.
     */
    public static int findSmallest(int a, int b, int c) {
        int small = a;
        if (b < small) {
            small = b;
        }
        if (c < small) {
            small = c;
        }
        return small;
        
        // Alternatively, using the Math.min method (more concise):
        // return Math.min(a, Math.min(b, c));
    }

    // ---
    
    /**
     * Calculates the average of three integers.
     * The result is a double to ensure precision.
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return The average as a double.
     */
    public static double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        // Cast the sum to a double before dividing to get a precise floating-point result
        return (double) sum / 3;
    }
}
