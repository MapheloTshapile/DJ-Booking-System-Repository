/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.domain;

/*
Equipment.java
Equipment POJO Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 11 May 2025
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipment {
//Tags to create auto generated primary key Id.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//Entity attributes.
    private String equipmentId, equipmentName, equipmentStatus;
//No argument/empty constructor. 

    public Equipment() {

    }
//Builder pattern constructor.

    private Equipment(EquipmentBuilder builder) {

        this.equipmentId = builder.equipmentId;
        this.equipmentName = builder.equipmentName;
        this.equipmentStatus = builder.equipmentStatus;

    }
//Get methods.

    public String getequipmentId() {
        return equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }
//toString method.

    @Override
    public String toString() {
        return "Equipment{" + "equipmentId=" + equipmentId + ", equipmentName=" + equipmentName + ", equipmentStatus=" + equipmentStatus + '}';
    }
//Builder pattern inner class.

    public static class EquipmentBuilder {
//Builder pattern attributes.

        private String equipmentId, equipmentName, equipmentStatus;
//Builder pattern inner class mutators.

        public EquipmentBuilder setequipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
            return this;
        }

        public EquipmentBuilder setequipmentName(String equipmentName) {
            this.equipmentName = equipmentName;
            return this;
        }

        public EquipmentBuilder setequipmentStatus(String equipmentStatus) {
            this.equipmentStatus = equipmentStatus;
            return this;
        }
//method of type DJ that returns an instance of the builder pattern inner class.

        public Equipment EquipmentBuild() {

            return new Equipment(this);
        }

    }
}//End of Class Equipment.
