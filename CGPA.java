import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("This is a programme to calculate CGPA from the marks you enter");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of Subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of Subject 3");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks of Subject 4");
        int sub4 = sc.nextInt();
        
        double percentage = (sub1 + sub2 + sub3 + sub4) / 4.0;
        double cgpa = percentage / 9.5;
        System.out.println("The CGPA of subjects is: " + cgpa);
        
        if (cgpa >= 9) {
            System.out.println("Your Grade is A+");
        } else if (cgpa >= 8) {
            System.out.println("Your Grade is A");
        } else if (cgpa >= 7) {
            System.out.println("Your Grade is B+");
        } else if (cgpa >= 6) {
            System.out.println("Your Grade is B");
        } else if (cgpa >= 5) {
            System.out.println("Your Grade is C");
        } else if (cgpa >= 4) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is F, You need to work hard");
        }
        
        System.out.println("The percentage of subjects is: " + percentage + "% \n Good Job !");
    }
}
