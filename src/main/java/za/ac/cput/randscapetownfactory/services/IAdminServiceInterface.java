/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
AdminServiceInterface.java
Admin Service Interface
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import java.util.List;
import java.util.Optional;
import za.ac.cput.randscapetownfactory.domain.Admin;

public interface IAdminServiceInterface extends IService<Admin, String> {

    @Override
    Admin create(Admin admin);

    @Override
    Admin update(Admin admin);

    @Override
    boolean delete(String adminNumber);

    Optional<Admin> findById(Integer adminNumber);

    List<Admin> getAll();

}
