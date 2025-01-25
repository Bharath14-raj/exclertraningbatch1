
import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Strung: ");
        String str = scanner.nextLine();
        String upperCaseString = str.toUpperCase();
        String lowerCaseString = str.toLowerCase();
        System.out.println("upperCaseString: " + upperCaseString);
        System.out.println("lowerCaseString: " + lowerCaseString);
        scanner.close();
    }

    
}
