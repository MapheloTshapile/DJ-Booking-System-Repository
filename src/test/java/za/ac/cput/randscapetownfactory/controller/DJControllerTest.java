/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.cput.randscapetownfactory.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.factory.DJFactory;
import static org.junit.jupiter.api.Assertions.*;

/*
DJControllerTest.java
DJ Controller Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DJControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static DJ dj;

    private String BASE_URL;

    // private static final String BASE_URL = "http://localhost:8080/dj";
    @BeforeAll
    public static void setUp() {
        dj = DJFactory.createDJ("dj01", "DJ Sdunkero", "sdunkerodj@cput.ac.za", "0843975076", "Available");
    }

    @BeforeEach
    void init() {
        BASE_URL = "http://localhost:" + port + "/dj";
    }

    @Test
    @Order(1)
    void createTest() {
        String url = BASE_URL + "/create";
        DJ createdDJ = this.restTemplate.postForObject(url, dj, DJ.class);
        assertNotNull(createdDJ);
        assertEquals(dj.getDjId(), createdDJ.getDjId());

        System.out.println("Created test is succesful if null: " + createdDJ);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + dj.getDjId();
        DJ readDJ = this.restTemplate.getForObject(url, DJ.class);
        assertNotNull(readDJ);
        assertEquals(dj.getDjId(), readDJ.getDjId());
        System.out.println("Read test is succesful if null: " + readDJ);
    }

    @Test
    @Order(3)
    void updateTest() {
        String url = BASE_URL + "/update";
        DJ updatedDJ = new DJ.DJBuilder().setdjName("DJ Fresh").DJBuild();
        this.restTemplate.put(url, updatedDJ);
        DJ readUpdatedDJ = this.restTemplate.getForObject(url + dj.getDjId(), DJ.class);
        assertNotNull(readUpdatedDJ);
        assertNotEquals(dj.getName(), readUpdatedDJ.getName());
        System.out.println("Updated test is succesful if null: " + readUpdatedDJ);
    }

    @Test
    @Order(3)
    void deleteTest() {
        String url = BASE_URL + "/delete/";

        this.restTemplate.delete((url) + dj.getDjId());

        DJ deletedDJ = this.restTemplate.getForObject(url + dj.getDjId(), DJ.class);
        assertNotNull(deletedDJ);
        System.out.println("Deleted test is succesful if null:" + deletedDJ);
    }

    @Test
    @Order(4)
    void getAllDatesTest() {
        String url = BASE_URL + "/getall";
        DJ[] djs = this.restTemplate.getForObject(url, DJ[].class);
        assertNotNull(djs);
        System.out.println("All Dates : ");
        for (DJ d : djs) {
            System.out.println(d);
        }
    }

}
