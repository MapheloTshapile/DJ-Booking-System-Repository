/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.factory;

/*
Equipment.java
Equipment EquipmentFactory Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 15 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.util.Helper;

public class EquipmentFactory {

    public static Equipment createEquipment(String equipmentId, String equipmentName, String equipmentStatus) {

        Helper.generateID(equipmentId);
        Helper.isStringNullOrEmpty(equipmentName);
        Helper.isValidAvailStatus(equipmentStatus);

        return new Equipment.EquipmentBuilder()
                .setequipmentId(equipmentId)
                .setequipmentName(equipmentName)
                .setequipmentStatus(equipmentStatus)
                .EquipmentBuild();

    }

    public static Equipment createBasic() {
        return new Equipment.EquipmentBuilder()
                .setequipmentId("eq01")
                .setequipmentName("RCN 15' Speaker")
                .setequipmentStatus("Available")
                .EquipmentBuild();

    }

}
