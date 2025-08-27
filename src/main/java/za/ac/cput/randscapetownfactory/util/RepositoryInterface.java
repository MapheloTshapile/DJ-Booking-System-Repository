/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.cput.randscapetownfactory.util;

/*
Equipment.java
DJ Repository Class
Author: Maphelo Shaun Tshapile (213152231)
Date: 20 May 2025
 */
@Deprecated
public interface RepositoryInterface<T, ID> {

    T insert(T t);

    T read(ID id);

    T update(ID id);

    void delete(ID id);

}
