/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.factory.AdminFactory;

/*
AdminServiceTest.java
Admin Service Test
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
@SpringBootTest
public class AdminServiceTest {

    @Autowired
    private IAdminServiceInterface adminServiceTest;

    private final Admin admin = AdminFactory.createAdmin("ad01", "Maphelo", "Tshapile", "0745670032", "tshapilem@mycput.ac.za", "57 Alder St., Green Point", "5 Years");

    @Test
    void create() {
        Admin created = adminServiceTest.create(admin);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Admin read = adminServiceTest.findById(admin.getAdminNumber().indexOf(admin.getAdminNumber())).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Admin updatedAdmin = new Admin.AdminBuilder()
                .setadminNumber("ad01")
                .setadminFirstName("Maphelo")
                .setadminLastName("Tshapile")
                .setadminContactNumber("0745670032")
                .setadminEmailAddress("tshapilem@mycput.ac.za")
                .setadminHomeAddress("57 Alder St., Green Point")
                .setadminWorkExperince("5 Years")
                .AdminBuild();

        Admin updated = adminServiceTest.update(updatedAdmin);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(adminServiceTest.getAll());
    }

}
