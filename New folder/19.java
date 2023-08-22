import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("Capacity of sb1: " + sb1.capacity());
        System.out.println("Capacity of sb2: " + sb2.capacity());

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer reversedAndUppercase = new StringBuffer(input);
        reversedAndUppercase.reverse();
        reversedAndUppercase = new StringBuffer(reversedAndUppercase.toString().toUpperCase());

        System.out.println("Reversed and in uppercase: " + reversedAndUppercase);

        
        System.out.print("Enter another string to append: ");
        String appendText = scanner.nextLine();

        reversedAndUppercase.append(appendText);

        System.out.println("Final result: " + reversedAndUppercase);
    }
}
