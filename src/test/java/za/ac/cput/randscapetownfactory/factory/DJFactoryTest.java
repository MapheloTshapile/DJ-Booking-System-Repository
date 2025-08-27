/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.cput.randscapetownfactory.factory;


/*
DJFactoryTest.java
DJFactoryTest Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 15 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.domain.DJ.DJBuilder;
import za.ac.cput.randscapetownfactory.factory.DJFactory;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class DJFactoryTest {

    @Autowired

    DJ djOne = new DJ();

    private static DJBuilder djTwo = new DJBuilder()
            .setdjId("DJ1245")
            .setdjName("DJ Mbuso")
            .setcontactNumber("0747534193")
            .setemailAddress("mbuso@phezulu.com")
            .setavailabilityStatus("Available");

    @Test
    void testDJFactory() {

        assertNotNull(djOne);
        assertNotNull(djTwo);
        assertEquals(djOne, djTwo);

        System.out.print(djOne);
        System.out.print(djTwo);

    }
}
