import java.util.Scanner;

public class EnhancedBMICalculator {
    public static void main(String[] args) {
        System.out.println("--- Enhanced BMI Calculator (Metric) ---");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight in kilograms (kg): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height in meters (m): ");
        double height = sc.nextDouble();
        
        // Formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        
        // --- 1. BMI Categorization ---
        System.out.print("BMI Status: ");
        if (bmi < 18.5) {
            System.out.println("Underweight 😟");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight (Healthy) 👍");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight ⚠️");
        } else {
            System.out.println("Obese 🛑");
        }
        
        // --- 3. Ideal Weight Range Display ---
        double minIdealWeight = 18.5 * (height * height);
        double maxIdealWeight = 24.9 * (height * height);
        
        System.out.printf("For your height, the healthy weight range is %.2f kg to %.2f kg.\n", 
                          minIdealWeight, maxIdealWeight);

        sc.close();
    }

    // You could also add a separate method to handle imperial input as mentioned in point 2.
}
