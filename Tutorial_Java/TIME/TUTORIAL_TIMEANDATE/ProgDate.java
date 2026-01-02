package DatesTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProgDate {
    public static void main(String[] args) {
        //LocalDate, LocalTime, LocalDateTime, UTC timestamp

        /*LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);*/

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);
    }
}
