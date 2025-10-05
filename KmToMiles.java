import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter distance in kilometers: ");
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}