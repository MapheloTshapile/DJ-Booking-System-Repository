/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.repository;

import za.ac.cput.randscapetownfactory.util.RepositoryInterface;

/*
Equipment.java
Equipment Repository Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 20 May 2025
 */
import za.ac.cput.randscapetownfactory.domain.Equipment;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class EquipmentRepository implements JpaRepository<Equipment, String> {

 

}
