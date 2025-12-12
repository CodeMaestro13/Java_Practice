package Dateandtime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Date and Time Apis Example:-
public class DTExample {
    public static void main(String[] args) {

        // Local Date
        LocalDate aaj=LocalDate.now();
        System.out.println(aaj);
        // its by default formate is year ,month , date

        // plus date
        System.out.println(aaj.plusDays(1000));
        System.out.println(aaj.plusMonths(97));
        System.out.println(aaj.plusWeeks(20000000));
        System.out.println(aaj.plusYears(1000000));

        // for past days--minus
        System.out.println(aaj.minusDays(1000));
        System.out.println(aaj.minusMonths(234));
        System.out.println(aaj.minusWeeks(200));
        System.out.println(aaj.minusYears(23));



        // random date
        LocalDate randomDate=LocalDate.of(1904,9,11);
        System.out.println(randomDate);
        System.out.println(randomDate.isLeapYear());
        System.out.println(randomDate.getEra());

        // getdayof month --> give me day
        System.out.println(randomDate.getDayOfMonth());
        System.out.println(randomDate.getDayOfYear());
        System.out.println(randomDate.getDayOfWeek());
        System.out.println(randomDate.getMonth());
        System.out.println(randomDate.getMonthValue());


        // local time

        LocalTime abhikatime=LocalTime.now();
        System.out.println(abhikatime);
        System.out.println(abhikatime.plusHours(1000));
        System.out.println(abhikatime.plusMinutes(5000));
        System.out.println(abhikatime.plusSeconds(300403));
        System.out.println(abhikatime.plusNanos(349920039));

        System.out.println(abhikatime.minusHours(3994));
        System.out.println(abhikatime.minusMinutes(39943));
        System.out.println(abhikatime.minusSeconds(39943994));
        System.out.println(abhikatime.minusNanos(988550934));


        LocalDateTime atime=LocalDateTime.now();
        System.out.println(atime);

        System.out.println(abhikatime.toNanoOfDay());

        // local data and time

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);


        // for random date
        LocalDateTime rldt= LocalDateTime.of(1920,12,30,3,4,5);
        System.out.println(rldt);

    }
}
// points:-
// Local D
