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
        
        int cgpa = (sub1+sub2+sub3+sub4)/4;
        System.out.println("The CGPA of subjects are: " + cgpa);
        
    }
}
