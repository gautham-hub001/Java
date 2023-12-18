import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        // LocalDate
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date yyyy-MM-dd. MM is in capitals because mm represents
                                   // minutes

        // LocalTime
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2); // HH:mm:ss.ns ns->6 digits nano seconds. hh represents 12 hour format and HH
                                    // represents 24 hour format

        // LocalDateTime
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3); // yyyy-MM-ddTHH:mm:ss.ns -> T is the seperator between date and time

        // DateTimeFormatter ***** It is most used
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");
        String formattedDate = myObj3.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MM/dd/yyyy , hh.mm.ss");
        String formattedDate2 = myObj3.format(myFormatObj2);
        System.out.println("After formatting: " + formattedDate2);

        // String to LocalDate
        String datee = "09-12-2000";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(datee, dtf);
        System.out.println("string to localdate: " + date); // string to localdate: 2000-12-09

        // LocalDate to String
        String dateagain = date.toString();
        System.out.println("date to string: " + dateagain); // date to string: 2000-12-09
    }
}
