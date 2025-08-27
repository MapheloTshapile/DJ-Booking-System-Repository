/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.factory.DJFactory;

/*
DJServiceTest.java
DJ Service Test
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
@SpringBootTest
public class DJServiceTest {

    @Autowired
    private IDJServiceInterface djServiceTest;

    private final DJ dj = DJFactory.createDJ("dj01", "DJ Sdunkero", "sdunkerodj@cput.ac.za", "0843975076", "Available");

    @Test
    void create() {
        DJ created = djServiceTest.create(dj);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        DJ read = djServiceTest.findById(dj.getDjId().indexOf(dj.getDjId())).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        DJ updatedDJ = new DJ.DJBuilder()
                .setdjId("dj01")
                .setdjName("DJ Sdunkero")
                .setemailAddress("sdunkerodj@cput.ac.za")
                .setcontactNumber("0843975076")
                .setavailabilityStatus("Available")
                .DJBuild();

        DJ updated = djServiceTest.update(updatedDJ);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(djServiceTest.getAll());
    }

}
