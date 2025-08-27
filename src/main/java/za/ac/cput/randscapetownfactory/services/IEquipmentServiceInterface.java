/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
EquipmentServiceInterface.java
Equipment Service Interface
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import java.util.List;
import java.util.Optional;
import za.ac.cput.randscapetownfactory.domain.Equipment;

public interface IEquipmentServiceInterface extends IService<Equipment, String> {

    @Override
    Equipment create(Equipment equipment);

    @Override
    Equipment update(Equipment equipment);

    @Override
    boolean delete(String equipmentId);

    Optional<Equipment> findById(Integer equipmentId);

    List<Equipment> getAll();

}
