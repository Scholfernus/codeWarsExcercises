package org.example.w3resource.com.conditionalStatement;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PrintCurrentDateInGMT {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String format = gmtTime.format(formatter);
        System.out.println("Aktualny czas GMT "+ format);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
    }
}

