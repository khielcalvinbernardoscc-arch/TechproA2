import java.util.Date;
import java.util.GregorianCalendar;

 class DateDemo {
     static void main(String args[]) {
        // First demo: Date class
        System.out.println("=== Date Demo ===");
        Date date = new Date();
        String str = String.format("Current Date/Time :  %tc", date);
        System.out.println(str);
        
        // Second demo: GregorianCalendar
        System.out.println("\n=== GregorianCalendar Demo ===");
        demonstrateGregorianCalendar();
    }

    static void demonstrateGregorianCalendar() {
        String months[] = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        // Create a Gregorian calendar initialized with current date/time
        GregorianCalendar gcalendar = new GregorianCalendar();

        // Display current time and date information
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(GregorianCalendar.MONTH)]);
        System.out.print(" " + gcalendar.get(GregorianCalendar.DATE) + " ");
        System.out.println(gcalendar.get(GregorianCalendar.YEAR));
    }
}
