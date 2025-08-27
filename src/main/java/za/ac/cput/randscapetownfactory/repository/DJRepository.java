/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.repository;

/*
DjRepository.java
DJ Repository Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */

import za.ac.cput.randscapetownfactory.domain.DJ;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class DJRepository implements JpaRepository<DJ, String>{

    
    
}
