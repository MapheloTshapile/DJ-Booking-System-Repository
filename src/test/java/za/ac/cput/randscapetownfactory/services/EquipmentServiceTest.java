/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.factory.EquipmentFactory;

/*
EquipmentServiceTest.java
Equipment Service Test
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
@SpringBootTest
public class EquipmentServiceTest {

    @Autowired
    private IEquipmentServiceInterface equipmentServiceTest;

    private final Equipment equipment = EquipmentFactory.createEquipment("eq01", "RCN 15' Speaker", "Available");

    @Test
    void create() {
        Equipment created = equipmentServiceTest.create(equipment);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Equipment read = equipmentServiceTest.findById(equipment.getequipmentId().indexOf(equipment.getequipmentId())).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Equipment updatedEquipment = new Equipment.EquipmentBuilder()
                .setequipmentId("eq01")
                .setequipmentName("RCN 15' Speaker")
                .setequipmentStatus("Available")
                .EquipmentBuild();

        Equipment updated = equipmentServiceTest.update(updatedEquipment);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(equipmentServiceTest.getAll());
    }

}
