import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (MM/dd/yyyy): ");
        String inputDate = scanner.nextLine();
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");
        
        try {
            Date date = inputFormat.parse(inputDate);
            String outputDate = outputFormat.format(date);
            System.out.println("Formatted date: " + outputDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter a valid date.");
        }
    }
}
