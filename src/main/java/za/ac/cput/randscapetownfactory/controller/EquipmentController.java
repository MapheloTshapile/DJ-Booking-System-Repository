/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.controller;

/*
EquipmentController.java
Equipment Controller Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Equipment;
import za.ac.cput.randscapetownfactory.domain.Equipment.EquipmentBuilder;
import za.ac.cput.randscapetownfactory.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Equipment")
public class EquipmentController {

    private EquipmentService eService;

    @Autowired
    public EquipmentController(EquipmentService equipmentService) {
        eService = equipmentService;
    }

    @GetMapping("get/date/{id}")
    public Equipment read(@PathVariable String equipmentId) {
        return eService.read(equipmentId);
    }

    @GetMapping("/get/dates")
    public List<Equipment> getAll() {
        return eService.getAll();
    }

    @PostMapping("/create")
    public Equipment create(@RequestBody Equipment equipment) {
        return eService.create(equipment);
    }

    @PutMapping("/update")
    public Equipment update(@RequestBody Equipment equipment) {
        return eService.update(equipment);
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody String equipmentId) {
        return eService.delete(equipmentId);
    }

}
