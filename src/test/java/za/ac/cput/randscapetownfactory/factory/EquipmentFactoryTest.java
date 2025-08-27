/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.factory;

/*
Equipment.java
EquipmentFactoryTest Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 15 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.domain.Equipment.EquipmentBuilder;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import za.ac.cput.randscapetownfactory.factory.AdminFactory;


@SpringBootTest
public class EquipmentFactoryTest {

    @Autowired

    Equipment equipmentOne = new Equipment();

    private static EquipmentBuilder equipmentTwo = new EquipmentBuilder()
            .setequipmentId("6564")
            .setequipmentName("Dixon")
            .setequipmentStatus("Available");

    @Test
    void testEquipmentFactory() {

        assertNotNull(equipmentOne);
        assertNotNull(equipmentTwo);
        assertEquals(equipmentOne, equipmentTwo);

        System.out.print(equipmentOne);
        System.out.print(equipmentTwo);

    }
}
