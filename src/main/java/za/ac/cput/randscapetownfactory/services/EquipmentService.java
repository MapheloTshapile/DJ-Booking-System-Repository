/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
EquipmentService.java
Equipment Service Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipmentService {

    EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public Equipment create(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public Equipment read(String equipmentId) {
        return equipmentRepository.findById(equipmentId).orElse(null);
    }

    public Equipment update(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public boolean delete(String equipmentId) {
        equipmentRepository.deleteById(equipmentId);
        return true;
    }

    public List<Equipment> getAll() {
        return equipmentRepository.findAll();
    }

}
