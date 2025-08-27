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
import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.factory.AdminFactory;
import static org.junit.jupiter.api.Assertions.*;

/*
AdminControllerTest.java
Admin Controller Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static Admin admin;

    private String BASE_URL;

    // private static final String BASE_URL = "http://localhost:8080/admin";
    @BeforeAll
    public static void setUp() {
        admin = AdminFactory.createAdmin("ad01", "Maphelo", "Tshapile", "0745670032", "tshapilem@mycput.ac.za", "57 Alder St., Green Point", "5 Years");
    }

    @BeforeEach
    void init() {
        BASE_URL = "http://localhost:" + port + "/admin";
    }

    @Test
    @Order(1)
    void createTest() {
        String url = BASE_URL + "/create";
        Admin createdAdmin = this.restTemplate.postForObject(url, admin, Admin.class);
        assertNotNull(createdAdmin);
        assertEquals(admin.getAdminNumber(), createdAdmin.getAdminNumber());

        System.out.println("Created test is succesful if null: " + createdAdmin);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + admin.getAdminNumber();
        Admin readAdmin = this.restTemplate.getForObject(url, Admin.class);
        assertNotNull(readAdmin);
        assertEquals(admin.getAdminNumber(), readAdmin.getAdminNumber());
        System.out.println("Read test is succesful if null: " + readAdmin);
    }

    @Test
    @Order(3)
    void updateTest() {
        String url = BASE_URL + "/update";
        Admin updatedAdmin = new Admin.AdminBuilder().setadminFirstName("Zuma").AdminBuild();
        this.restTemplate.put(url, updatedAdmin);
        Admin readUpdatedAdmin = this.restTemplate.getForObject(url + admin.getAdminNumber(), Admin.class);
        assertNotNull(readUpdatedAdmin);
        assertNotEquals(admin.getAdminFirstName(), readUpdatedAdmin.getAdminFirstName());
        System.out.println("Updated test is succesful if null: " + readUpdatedAdmin);
    }

    @Test
    @Order(3)
    void deleteTest() {
        String url = BASE_URL + "/delete/";

        this.restTemplate.delete((url) + admin.getAdminNumber());

        Admin deletedAdmin = this.restTemplate.getForObject(url + admin.getAdminNumber(), Admin.class);
        assertNotNull(deletedAdmin);
        System.out.println("Deleted test is succesful if null:" + deletedAdmin);
    }

    @Test
    @Order(4)
    void getAllDatesTest() {
        String url = BASE_URL + "/getall";
        Admin[] admins = this.restTemplate.getForObject(url, Admin[].class);
        assertNotNull(admins);
        System.out.println("All Dates : ");
        for (Admin d : admins) {
            System.out.println(d);
        }
    }

}
