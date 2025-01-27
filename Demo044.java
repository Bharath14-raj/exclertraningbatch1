
import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an  first integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter an second integer: ");
        int y = scanner.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping, first integer is: " + x);
        System.out.println("After swapping, second integer is: " + y);
        
    }
    
}
