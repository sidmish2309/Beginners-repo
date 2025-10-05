import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt(); 
        int num3 = sc.nextInt();
        int larg = num1;
        if (num2>larg){
            larg=num2;
        }
        if (num3>larg){
            larg=num3;
        }
        System.out.println("largest is : "+ larg);
    }
}