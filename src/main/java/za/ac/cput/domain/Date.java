package za.ac.cput.domain;
/**
 Leslie 230453260 - DATE entity
 */
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;



@Entity
@Table(name = "Date")
public class Date {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dateID;

    @NotBlank(message = "Day cannot be empty")
    private String day;

    @NotBlank(message = "Month cannot be empty")
    private String month;

    @Min(value = 2000, message = "Year must be greater than or equal to the current 2000 year period")
    private int year;

  public Date(){}
    public Date(String day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private Date(DateBuilder builder) {

        this.day = builder.buildDay;
        this.month = builder.buildMonth;
        this.year = builder.buildYear;
    }

    // Get

    public int getDateID() { return dateID; }
    public String getDay() { return day; }
    public String getMonth() { return month; }
    public int getYear() { return year; }


    @Override
    public String toString() {
        if (this.dateID == 0) {
            return null;
        }

        return "Date{" +
                "dateID=" + dateID +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(dateID);
//    }


    //////////////////////////////BUILDER/////////////////////////////////

    public static class DateBuilder {

        private String buildDay;
        private String buildMonth;
        private int buildYear;


        public DateBuilder(){}


        public DateBuilder(
                String day,
                String month,
                int year
        ) {

            this.buildDay = day;
            this.buildMonth = month;
            this.buildYear = year;
        }

        // Set

        public DateBuilder setDay(String day) {
            this.buildDay = day;
            return this;
        }

        public DateBuilder setMonth(String month) {
            this.buildMonth = month;
            return this;
        }

        public DateBuilder setYear(int year) {
            this.buildYear = year;
            return this;
        }
        // Copy
        public DateBuilder copy(Date date) {

            this.buildDay = date.getDay();
            this.buildMonth = date.getMonth();
            this.buildYear = date.getYear();
            return this;
        }

        // final build


public Date build() {
            return new Date(this);
        }
    }
}