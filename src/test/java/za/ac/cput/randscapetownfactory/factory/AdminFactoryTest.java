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
import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.domain.Admin.AdminBuilder;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import za.ac.cput.randscapetownfactory.factory.AdminFactory;


@SpringBootTest
public class AdminFactoryTest {

    @Autowired

    Admin adminOne = new Admin();

    private static AdminBuilder adminTwo = new AdminBuilder()
            .setadminNumber("admin1234")
                .setadminFirstName("Ntobeko")
                .setadminLastName("Masuku")
                .setadminContactNumber("0748605434")
                .setadminEmailAddress("masukun@cput.ac.za")
                .setadminHomeAddress("104 Albert Road, Ridgeworth, 7540")
                .setadminWorkExperince("5 Years");
                

        @Test
        public void testAdminFactory() {

        assertNotNull(adminOne);
        assertNotNull(adminTwo);
        assertEquals(adminOne, adminTwo);

        System.out.print(adminOne);
        System.out.print(adminTwo);

    }

}