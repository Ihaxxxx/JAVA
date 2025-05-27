import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        LocalDate date  = LocalDate.now();
//        LocalTime time  = LocalTime.now();
//        System.out.println(date);
//        System.out.println(time);
//
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//
//
//        Instant instant = Instant.now();
//        System.out.println(instant);
//
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//
//        System.out.println(newDateTime);
            LocalDate date  = LocalDate.of(2024,12,23);
            System.out.println(date);

        LocalDateTime dateTime1 = LocalDateTime.of(2024,12,15,12,0,0);
        LocalDateTime dateTime2 = LocalDateTime.of(2024,12,15,12,0,0);
//        LocalDateTime dateTime2 = LocalDateTime.of(2025,1,1,0,0,0);

        if (dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime1);
        } else if (dateTime2.isBefore(dateTime1)) {
            System.out.println(dateTime2 + " is late then " + dateTime2);
        } else if (dateTime2.isEqual(dateTime2)) {
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }


    }
}
