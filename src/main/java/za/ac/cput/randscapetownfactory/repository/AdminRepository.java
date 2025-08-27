/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.randscapetownfactory.repository;

/*
AdminRepository.java
Admin Repository Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 22 March 2025
 */
import za.ac.cput.randscapetownfactory.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AdminRepository implements JpaRepository<Admin, String> {

}
