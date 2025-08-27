/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
 /*
DJRepositoryTest.java
DJ Repository Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */
package za.ac.cput.randscapetownfactory.repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.domain.DJ.DJBuilder;

@SpringBootTest
public class DJRepositoryTest {

    @Autowired

    public static DJ djOne;

    public static DJBuilder djTwo = new DJBuilder()
            .setdjId("DJ1234")
            .setdjName("DJ Fresh")
            .setcontactNumber("0845673050")
            .setemailAddress("djfresh@bigdawg.co.za")
            .setavailabilityStatus("Available");

    @Test
    public void testDJRepository() {

        if (djOne.equals(djTwo)) {

            assertNotNull(djOne);
            assertNotNull(djTwo);
            assertEquals(djOne, djTwo);

            System.out.print(djOne);
            System.out.print(djTwo);

        }

    }

}
