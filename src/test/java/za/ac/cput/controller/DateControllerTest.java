package za.ac.cput.controller;



import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import za.ac.cput.domain.Date;
import za.ac.cput.domain.Review;
import za.ac.cput.factory.DateFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DateControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static Date date;


    private String BASE_URL;

   // private static final String BASE_URL = "http://localhost:8080/date";

    @BeforeAll
    public static void setUp() {
        date = DateFactory.createDate("Friday", "August", 2023);
    }

    @BeforeEach
    void init() {
        BASE_URL = "http://localhost:" + port + "/date";
    }



    @Test
    @Order(1)
    void createTest() {
        String url = BASE_URL + "/create";
        Date createdDate = this.restTemplate.postForObject(url, date, Date.class);
        assertNotNull(createdDate);
        assertEquals(date.getDateID(), createdDate.getDateID());

        System.out.println("Created test is succesful if null: " + createdDate);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + date.getDateID();
        Date readDate = this.restTemplate.getForObject(url, Date.class);
        assertNotNull(readDate);
        assertEquals(date.getDateID(), readDate.getDateID());
        System.out.println("Read test is succesful if null: " + readDate);
    }

    @Test
    @Order(3)
    void updateTest() {
        String url = BASE_URL + "/update";
        Date updatedDate = new Date.DateBuilder().copy(date).setDay("Friday").build();
        this.restTemplate.put(url, updatedDate);
        Date readUpdatedDate = this.restTemplate.getForObject(url + date.getDateID(), Date.class);
        assertNotNull(readUpdatedDate);
        assertNotEquals(date.getDay(), readUpdatedDate.getDay());
        System.out.println("Updated test is succesful if null: " + readUpdatedDate);
    }

    @Test
    @Order(3)
    void deleteTest() {
        String url = BASE_URL + "/delete/";

        this.restTemplate.delete((url) + date.getDateID());

        Date deletedDate = this.restTemplate.getForObject(url + date.getDateID(), Date.class);
        assertNotNull(deletedDate);
        System.out.println("Deleted test is succesful if null:" + deletedDate);
    }

    @Test
    @Order(4)
    void getAllDatesTest() {
        String url = BASE_URL + "/getall";
        Date[] dates = this.restTemplate.getForObject(url, Date[].class);
        assertNotNull(dates);
        System.out.println("All Dates : ");
        for (Date d : dates) {
            System.out.println(d);
        }
    }
}