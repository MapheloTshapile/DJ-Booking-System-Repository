/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

 /*
EquipmentRepositoryTest.java
Equipment Repository Test Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */

package za.ac.cput.randscapetownfactory.repository;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.domain.Equipment.EquipmentBuilder;

@SpringBootTest
public class EquipmentRepositoryTest {

    @Autowired

    public static Equipment equipmentOne;

    public static EquipmentBuilder equipmentTwo = new EquipmentBuilder()
            .setequipmentId("E706")
            .setequipmentName("JBL 600XS")
            .setequipmentStatus("Available");

    @Test
    public void testEquipmentRepository() {

        if (equipmentOne.equals(equipmentTwo)) {

            assertNotNull(equipmentOne);
            assertNotNull(equipmentTwo);
            assertEquals(equipmentOne, equipmentTwo);

            System.out.print(equipmentOne);
            System.out.print(equipmentTwo);

        }

    }

}
