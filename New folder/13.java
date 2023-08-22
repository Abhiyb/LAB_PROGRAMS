import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        
        String[] tokens = inputLine.split(" "); // Tokenize the line using spaces as delimiters
        
        System.out.println("Tokens in reverse order:");
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.println(tokens[i]);
        }
    }
}
