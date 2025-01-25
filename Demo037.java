public class Demo037 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        long num1 = scanner.nextLong();

        System.out.print("Enter the second number: ");
        long num2 = scanner.nextLong();
        System.out.print("Enter the third number: ");
        long num3 = scanner.nextLong();
        System.out.print("Enter the fourth number: ");
        long num4 = scanner.nextLong();
        if (num1 > num2 && num1 > num3 && num1 > num4) { 
            System.out.println(num1 + " is larger.");
        } else if (num2 > num1 && num2 > num3 ) {
            System.out.println(num2 + " is larger.");
        } else {
            System.out.println(num3 + " is larger.");
            System.out.println(num4 + " is larger.");
        }

        scanner.close();
    }
}
