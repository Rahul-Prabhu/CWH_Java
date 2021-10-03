package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.*;

public class CWH_100_DateTimeClass {
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());

        Clock cl1 = Clock.systemUTC();

        System.out.println(cl1.instant());

        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(d2.isNegative());

        Duration D1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(D1.isZero());

        Duration D2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'

        System.out.println(D2.isZero());

        LocalDate x = LocalDate.parse("2021-05-27");
        LocalDate x1= LocalDate.parse("2021-05-26");
        LocalDate x2= LocalDate.parse("2021-05-26");

        System.out.println(x1.equals(x));
        System.out.println(x2.equals(x1));

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDate e = LocalDate.parse("2021-05-27");
        System.out.println(e.withYear(2001));

        LocalTime T = LocalTime.now();
        System.out.println(T);

        LocalTime f = LocalTime.of(13,18,29);
        System.out.println("Time before : "  + f);

        LocalTime f1= f.plusHours(5);
        System.out.println("Time after adding 5 hours : " + f1);


        LocalTime y = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + y);

        LocalTime y1= y.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + y1);
    }
}
