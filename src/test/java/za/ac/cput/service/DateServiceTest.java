package za.ac.cput.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Date;
import za.ac.cput.factory.DateFactory;


@SpringBootTest
class DateServiceTest {

    @Autowired
    private IDateService dateServiceTest;

    private final Date date = DateFactory.createDate(
            "Sunday",
            "Febrauary",
            2004
    );

    @Test
    void create() {
        Date created = dateServiceTest.create(date);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Date read = dateServiceTest.findById(date.getDateID()).orElse(null);;
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Date updatedDate = new Date.DateBuilder()
                .setDay("Monday")
                .setMonth("January")
                .setYear(2004)
                .build();

        Date updated = dateServiceTest.update(updatedDate);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(dateServiceTest.getAll());
    }
}