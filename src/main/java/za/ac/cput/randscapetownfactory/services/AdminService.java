/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
AdminService.java
Admin Service Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Admin;
import za.ac.cput.randscapetownfactory.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {

    AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin read(String adminNumber) {
        return adminRepository.findById(adminNumber).orElse(null);
    }

    public Admin update(Admin admin) {
        return adminRepository.save(admin);
    }

    public boolean delete(String adminNumber) {
        adminRepository.deleteById(adminNumber);
        return true;
    }

    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

}
