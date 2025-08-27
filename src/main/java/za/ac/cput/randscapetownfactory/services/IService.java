/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.cput.randscapetownfactory.services;

/*
IService.java
IService Interface
Author: Maphelo Shaun Tshapile (213152231)
Date: 10 May 2025
 */
public interface IService<T, ID> {

    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);

}
