
import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String numberAString = Integer.toString(num);
        System.out.println("The number as a string: " + numberAString);

        scanner.close();
        
    }
    
}
