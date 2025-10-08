import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        System.out.println("--- Compound Interest Calculator ---");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount (P): ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter annual interest rate (in %): ");
        double ratePercent = sc.nextDouble();
        double rate = ratePercent / 100.0;  // 轉換成小數
        
        System.out.print("Enter time period in years (T): ");
        double time = sc.nextDouble();
        
        System.out.print("Enter number of times interest is compounded per year (N): ");
        System.out.print("\n  (1 = annually, 4 = quarterly, 12 = monthly): ");
        int n = sc.nextInt();
        
        double amount = principal * Math.pow((1 + rate / n), n * time);
        double compoundInterest = amount - principal;
        
        System.out.println("\n--- Results ---");
        System.out.printf("Principal Amount: $%.2f%n", principal);
        System.out.printf("Interest Rate: %.2f%%%n", ratePercent);
        System.out.printf("Time Period: %.1f years%n", time);
        System.out.printf("Compounding Frequency: %d times per year%n", n);
        System.out.printf("Final Amount: $%.2f%n", amount);
        System.out.printf("Compound Interest Earned: $%.2f%n", compoundInterest);
        
        sc.close();
    }
}