import java.util.Scanner;

public class SearchCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        
        System.out.print("Enter the search character: ");
        char searchChar = scanner.next().charAt(0);
        
        int count = 0;
        int index = -1;

        while ((index = inputLine.indexOf(searchChar, index + 1)) != -1) {
            count++;
        }
        
        System.out.println("Number of occurrences of '" + searchChar + "': " + count);
    }
}
