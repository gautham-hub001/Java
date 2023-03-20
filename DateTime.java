import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DateTime {
    public static void main(String[] args) {
        // LocalDate
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date yyyy-MM-dd.  MM is in capitals because mm represents minutes

        // LocalTime
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2); // HH:mm:ss.ns  ns->6 digits nano seconds. hh represents 12 hour format and HH represents 24 hour format

        // LocalDateTime
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3); // yyyy-MM-ddTHH:mm:ss.ns  -> T is the seperator between date and time

        // DateTimeFormatter *****
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");
        String formattedDate = myObj3.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MM/dd/yyyy , hh.mm.ss");
        String formattedDate2 = myObj3.format(myFormatObj2);
        System.out.println("After formatting: " + formattedDate2);
    }
}
