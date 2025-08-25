package za.ac.cput.service;
import za.ac.cput.domain.Date;

import java.util.List;
import java.util.Optional;

public interface IDateService extends IService<Date, Integer> {


    Date create(Date date);
    Date update(Date date);
    boolean delete(Integer id);
    Optional<Date> findById(Integer dateId);
    List<Date> getAll();

}