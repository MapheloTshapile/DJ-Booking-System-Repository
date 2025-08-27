/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.controller;

/*
DJController.java
DJ Controller Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.domain.DJ.DJBuilder;
import za.ac.cput.randscapetownfactory.services.DJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("DJ")

public class DJController {

    private DJService dservice;

    @Autowired
    public DJController(DJService djService) {
        dservice = djService;
    }

    @GetMapping("get/date/{id}")
    public DJ read(@PathVariable String djId) {
        return dservice.read(djId);
    }

    @GetMapping("/get/dates")
    public List<DJ> getAll() {
        return dservice.getAll();
    }

    @PostMapping("/create")
    public DJ create(@RequestBody DJ dj) {
        return dservice.create(dj);
    }

    @PutMapping("/update")
    public DJ update(@RequestBody DJ dj) {
        return dservice.update(dj);
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody String djId) {
        return dservice.delete(djId);
    }

}
