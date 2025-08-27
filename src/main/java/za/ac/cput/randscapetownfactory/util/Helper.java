/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.util;

/*
Equipment.java
Equipment Helper Class
Author: Maphelo Shaun Tshapile - (213152231)
Boitumelo Chantel Xaba - (221097570)
Leslie Van Niel - (230453260)
Alvaro Ferraz - (2200750118)
Indiphile Wopela - (222841176)
Date: 15 May 2025
 */
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static String generateID(String id) {
        return id = UUID.randomUUID().toString();
    }

    public static boolean isStringNullOrEmpty(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {

            return false;

        }

        return true;
    }

    public static boolean isValidContactNumber(String str) {
        if (str.startsWith("-")) {
            return false;
        }
        return true;
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidAvailStatus(String status) {
        if (status == "Available" || status == "Not Available") {
            return true;
        }
        return false;
    } //End of Maphelo Shaun Tshapile (213152231)

    public static boolean IsEmptyOrNullString(String str) {
        if (str.isEmpty() || str == null) {
            return true;
        }
        return false;
    }

    public static class ReviewHelper {
        //LeslieVanNiel-230453260

        //ensure rating is out of 10
        public static boolean IsInvalidRating(int reviewRating) {
            if (reviewRating > 10 || reviewRating < 0) {
                return true;
            }
            return false;
        }

        public static boolean IsBadComment(String str) {
            if (str == null || str.isEmpty() || str.startsWith("@")) {
                return true;
            }
            return false;
        }
    }

    public static class DateHelper {

        //LeslieVanNiel-230453260
        public static boolean IsInvalidYear(int dateYear) {
            if (dateYear > 2025 || dateYear < 0) {
                return true;
            }
            return false;

        }

        public static boolean IsInvalidMonth(String dateMonth) {
            if (dateMonth.equals("January")
                    || dateMonth.equals("February")
                    || dateMonth.equals("March")
                    || dateMonth.equals("April")
                    || dateMonth.equals("May")
                    || dateMonth.equals("June")
                    || dateMonth.equals("July")
                    || dateMonth.equals("August")
                    || dateMonth.equals("September")
                    || dateMonth.equals("October")
                    || dateMonth.equals("November")
                    || dateMonth.equals("December")) {
                return true;
            }

            return false;

        }

        public static boolean IsInvalidDay(int dateDay) {
            if (dateDay > 31 || dateDay < 0) {
                return true;
            }
            return false;

        }

    }//End of Leslie Van Niel - (230453260).

    //Change timeslot datatype on the UML Class Diagram to String.
    public static String validatetimeSlotId(String i) {

        System.out.print(i);
        return i;

    }

    public static String validatedAvailabilitystatus(String s) {

        String statusAvailable = "Available";
        String statusnotAvailable = "Not Available";

        if (s.equals(statusAvailable) || s.equals(statusnotAvailable)) {

            System.out.println(s);

        }
        return s;

    }

    public static int validateTimeSlotDuration(int duration) {
        if (duration > 0 && duration <= 120) {
            System.out.println("Valid timeSlotDuration: " + duration);
            return duration;
        } else {
            throw new IllegalArgumentException("Invalid timeSlotDuration. It must be between 1 and 120 minutes.");
        }
    }

    public static void validatedjAvailabilitystatus(String djAvailabilitystatus) {
    }

    public static boolean isNullOrEmpty(String genreId) {
        if (genreId == null || genreId.isEmpty()) {
            return true;
        }
        return false;

    } //End of Alvaro

    public static String generateID() {
        return UUID.randomUUID().toString();
    }

    public static boolean isValidYear(String year) {
        if (isStringNullOrEmpty(year)) {
            return false;
        }
        return year.matches("\\d{4}");
    }

    public static boolean isValidAmount(Double amount) {
        if (amount == amount.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(String date) {
        if (isStringNullOrEmpty(date)) {
            return false;
        }
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    } //End of Indiphile Wopela (222841176)

} //End of Class Helper.
