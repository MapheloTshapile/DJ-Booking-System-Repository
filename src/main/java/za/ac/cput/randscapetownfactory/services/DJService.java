/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
DJService.java
DJ Service Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.DJ;
import za.ac.cput.randscapetownfactory.repository.DJRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DJService {

    DJRepository djRepository;

    @Autowired
    public DJService(DJRepository djRepository) {
        this.djRepository = djRepository;
    }

    public DJ create(DJ dj) {
        return djRepository.save(dj);
    }

    public DJ read(String djId) {
        return djRepository.findById(djId).orElse(null);
    }

    public DJ update(DJ dj) {
        return djRepository.save(dj);
    }

    public boolean delete(String djId) {
        djRepository.deleteById(djId);
        return true;
    }

    public List<DJ> getAll() {
        return djRepository.findAll();
    }

}
