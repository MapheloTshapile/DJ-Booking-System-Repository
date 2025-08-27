/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
 /*
AdminRepositoryTest.java
Admin Repository Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */
package za.ac.cput.randscapetownfactory.repository;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.domain.Admin.AdminBuilder;

@SpringBootTest
public class AdminRepositoryTest {
    
    @Autowired
    
    public static Admin AdminOne;
    
    public static AdminBuilder AdminTwo = new AdminBuilder()
            .setadminNumber("ad01")
            .setadminFirstName("Maphelo")
            .setadminLastName("Tshapile")
            .setadminContactNumber("0747534193")
            .setadminEmailAddress("maphelo@bigdawg.co.za")
            .setadminHomeAddress("105 Larry St. Observatory")
            .setadminWorkExperince("10 Years");
    
    @Test
    public void testAdminRepository() {
        
        if (AdminOne.equals(AdminTwo)) {
            
            assertNotNull(AdminOne);
            assertNotNull(AdminTwo);
            assertEquals(AdminOne, AdminTwo);
            
            System.out.print(AdminOne);
            System.out.print(AdminTwo);
            
        }
        
    }
    
}
