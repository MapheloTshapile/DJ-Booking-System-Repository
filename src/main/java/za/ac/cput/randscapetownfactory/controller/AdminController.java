/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.controller;

/*
AdminController.java
Admin Controller Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.domain.Admin.AdminBuilder;
import za.ac.cput.randscapetownfactory.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin")

public class AdminController {

    private AdminService aservice;

    @Autowired
    public AdminController(AdminService adminService) {
        aservice = adminService;
    }

    @GetMapping("get/date/{id}")
    public Admin read(@PathVariable String adminNumber) {
        return aservice.read(adminNumber);
    }

    @GetMapping("/get/dates")
    public List<Admin> getAll() {
        return aservice.getAll();
    }

    @PostMapping("/create")
    public Admin create(@RequestBody Admin admin) {
        return aservice.create(admin);
    }

    @PutMapping("/update")
    public Admin update(@RequestBody Admin admin) {
        return aservice.update(admin);
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody String adminNumber) {
        return aservice.delete(adminNumber);
    }

}