import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        
        String uppercaseText = inputLine.toUpperCase();
        String lowercaseText = inputLine.toLowerCase();
        
        System.out.println("Uppercase: " + uppercaseText);
        System.out.println("Lowercase: " + lowercaseText);
    }
}
