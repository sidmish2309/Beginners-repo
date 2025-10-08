import java.util.Scanner;

public class KmToMiles {

    // Define the conversion constants
    public static final double MILES_PER_KM = 0.621371;
    public static final int METERS_PER_KM = 1000;
    public static final int CM_PER_METER = 100;
    public static final double FEET_PER_METER = 3.28084;
    
    // --- NEW CONSTANTS ---
    public static final double NAUTICAL_MILES_PER_KM = 0.539957; // 1 km ≈ 0.539957 nautical miles
    public static final double YARDS_PER_METER = 1.09361; // 1 meter ≈ 1.09361 yards
    public static final int INCHES_PER_FOOT = 12; // 1 foot = 12 inches

    public static void main(String[] args) {

        // --- Input ---
        System.out.println("Enter distance in kilometers: ");
        Scanner sc = new Scanner(System.in);

        // Basic input validation
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numerical value.");
            sc.close();
            return;
        }
        double kilometers = sc.nextDouble();
        sc.close();

        // --- Core Calculations (Intermediate Units) ---
        double meters = kilometers * METERS_PER_KM;
        double feet = meters * FEET_PER_METER;

        // --- All Conversions ---

        // Original Units
        double miles = kilometers * MILES_PER_KM;
        double centimeters = meters * CM_PER_METER;

        // --- NEW UNITS ---
        
        // 1. Nautical Miles (used for sea/air navigation, often associated with Knots)
        double nauticalMiles = kilometers * NAUTICAL_MILES_PER_KM;

        // 2. Yards (calculated from meters)
        double yards = meters * YARDS_PER_METER;
        
        // 3. Inches (calculated from feet)
        double inches = feet * INCHES_PER_FOOT;

        // --- Output ---

        String kmFormat = String.format("%.4f", kilometers);

        System.out.println("\n--- Conversion Results for " + kmFormat + " km ---");

        System.out.println("Miles: \t\t\t" + String.format("%.4f", miles));
        System.out.println("Nautical Miles: \t" + String.format("%.4f", nauticalMiles)); // NEW
        System.out.println("-------------------------------------------------");
        System.out.println("Meters: \t\t" + String.format("%.2f", meters));
        System.out.println("Centimeters: \t" + String.format("%.2f", centimeters));
        System.out.println("Feet: \t\t\t" + String.format("%.4f", feet));
        System.out.println("Yards: \t\t\t" + String.format("%.4f", yards));        // NEW
        System.out.println("Inches: \t\t" + String.format("%.4f", inches));      // NEW
    }
}
