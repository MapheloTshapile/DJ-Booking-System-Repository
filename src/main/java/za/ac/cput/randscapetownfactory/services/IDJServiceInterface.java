/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
DJServiceInterface.java
DJ Service Interface
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
import java.util.List;
import java.util.Optional;
import za.ac.cput.randscapetownfactory.domain.DJ;

public interface IDJServiceInterface extends IService<DJ, String> {

    @Override
    DJ create(DJ dj);

    @Override
    DJ update(DJ dj);

    @Override
    boolean delete(String djId);

    Optional<DJ> findById(Integer djId);

    List<DJ> getAll();

}
