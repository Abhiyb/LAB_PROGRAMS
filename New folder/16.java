import java.util.Scanner;

public class ThreeLetterCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = scanner.nextLine().toLowerCase();
        
        if (word.length() != 5) {
            System.out.println("Please enter a five-letter word.");
            return;
        }
        
        System.out.println("Three-letter combinations:");

        for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
               if (i != j && i != k && j != k) {
                        System.out.println("" + word.charAt(i) + word.charAt(j) + word.charAt(k));
                              }
                     }
                  }
                }
    }
}
