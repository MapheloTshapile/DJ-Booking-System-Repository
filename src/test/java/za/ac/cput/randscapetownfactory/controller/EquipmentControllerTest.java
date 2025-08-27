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
import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.factory.EquipmentFactory;
import static org.junit.jupiter.api.Assertions.*;

/*
EquipmentControllerTest.java
Equipment Controller Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EquipmentControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static Equipment equipment;

    private String BASE_URL;

    // private static final String BASE_URL = "http://localhost:8080/dj";
    @BeforeAll
    public static void setUp() {
        equipment = EquipmentFactory.createEquipment("eq01", "RCN 15' Speaker", "Available");
    }

    @BeforeEach
    void init() {
        BASE_URL = "http://localhost:" + port + "/equipment";
    }

    @Test
    @Order(1)
    void createTest() {
        String url = BASE_URL + "/create";
        Equipment createdEquipment = this.restTemplate.postForObject(url, equipment, Equipment.class);
        assertNotNull(createdEquipment);
        assertEquals(equipment.getequipmentId(), createdEquipment.getequipmentId());

        System.out.println("Created test is succesful if null: " + createdEquipment);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + equipment.getequipmentId();
        Equipment readEquipment = this.restTemplate.getForObject(url, Equipment.class);
        assertNotNull(readEquipment);
        assertEquals(equipment.getequipmentId(), readEquipment.getequipmentId());
        System.out.println("Read test is succesful if null: " + readEquipment);
    }

    @Test
    @Order(3)
    void updateTest() {
        String url = BASE_URL + "/update";
        Equipment updatedEquipment = new Equipment.EquipmentBuilder().setequipmentName("JBL 15' Speaker").EquipmentBuild();
        this.restTemplate.put(url, updatedEquipment);
        Equipment readUpdatedEquipment = this.restTemplate.getForObject(url + equipment.getequipmentId(), Equipment.class);
        assertNotNull(readUpdatedEquipment);
        assertNotEquals(equipment.getEquipmentName(), readUpdatedEquipment.getequipmentId());
        System.out.println("Updated test is succesful if null: " + readUpdatedEquipment);
    }

    @Test
    @Order(3)
    void deleteTest() {
        String url = BASE_URL + "/delete/";

        this.restTemplate.delete((url) + equipment.getequipmentId());

        Equipment deletedDJ = this.restTemplate.getForObject(url + equipment.getequipmentId(), Equipment.class);
        assertNotNull(deletedDJ);
        System.out.println("Deleted test is succesful if null:" + deletedDJ);
    }

    @Test
    @Order(4)
    void getAllDatesTest() {
        String url = BASE_URL + "/getall";
        Equipment[] equipments = this.restTemplate.getForObject(url, Equipment[].class);
        assertNotNull(equipments);
        System.out.println("All Dates : ");
        for (Equipment d : equipments) {
            System.out.println(d);
        }
    }

}
