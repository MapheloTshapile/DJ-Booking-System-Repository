package za.ac.cput.factory;

import za.ac.cput.domain.Date;


public class DateFactory {

    public static Date createDate(

            String dDay,
            String dMonth,
            int dYear
    ) {

        if (dDay == null || dDay.trim().isEmpty()) {
            throw new IllegalArgumentException("Day cannot be empty or null");
        }

        // Validate year (no negative or unrealistic years)
        if (dYear <= 0 || dYear > 9999) {
            throw new IllegalArgumentException("Invalid year: " + dYear);
        }

        // Optionally validate that the month contains only letters
        if (!dMonth.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("Month must only contain letters: " + dMonth);
        }


        if (!dDay.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("Day must only contain letters: " + dDay);
        }


        return new Date.DateBuilder()

                .setDay(dDay)
                .setMonth(dMonth)
                .setYear(dYear)
                .build();
    }
}