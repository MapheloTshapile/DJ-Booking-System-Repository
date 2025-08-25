package za.ac.cput.controller;



import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import za.ac.cput.domain.Date;
import za.ac.cput.factory.DateFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DateControllerTest {

    private static Date date;


    @Autowired
    private TestRestTemplate restTemplate;
    private static final String BASE_URL = "http://localhost:8080/date";

    @BeforeAll
    public static void setUp() {
        date = DateFactory.createDate("Friday", "August", 2023);
    }

    @Test
    @Order(1)
    void create() {
        String url = BASE_URL + "/create";
        Date createdDate = this.restTemplate.postForObject(url, date, Date.class);
        assertNotNull(createdDate);
        assertNotEquals(date.getDateID(), createdDate.getDateID());
        System.out.println("Created: " + createdDate);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + date.getDateID();
        Date readDate = this.restTemplate.getForObject(url, Date.class);
        assertNotNull(readDate);
        assertNotEquals(date.getDateID(), readDate.getDateID());
        System.out.println("Read: " + readDate);
    }

    @Test
    @Order(3)
    void update() {
        String url = BASE_URL + "/update";
        Date updatedGuest = new Date.DateBuilder().copy(date).setDay("Friday").build();
        this.restTemplate.put(url, updatedGuest);
        Date readUpdatedDate = this.restTemplate.getForObject(url + date.getDateID(), Date.class);
        assertNotNull(readUpdatedDate);
        assertNotEquals(date.getDay(), readUpdatedDate.getDay());
        System.out.println("Updated: " + readUpdatedDate);
    }

    @Test
    @Order(3)
    void delete() {
        String url = BASE_URL + "/delete/";
        this.restTemplate.delete((url) + date.getDateID());
        Date deletedDate = this.restTemplate.getForObject(url + date.getDateID(), Date.class);
        assertNotNull(deletedDate);
        System.out.println("Deleted: " + deletedDate);
    }

    @Test
    @Order(4)
    void getAllGuest() {
        String url = BASE_URL + "/getall";
        Date[] dates = this.restTemplate.getForObject(url, Date[].class);
        assertNotNull(dates);
        System.out.println("All Dates: ");
        for (Date date : dates) {
            System.out.println(date);
        }
    }
}