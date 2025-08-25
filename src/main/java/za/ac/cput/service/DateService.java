package za.ac.cput.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Date;
import za.ac.cput.repository.DateRepo;

import java.util.List;
import java.util.Optional;

@Service
    public class DateService {

        DateRepo repo;

        @Autowired
        public DateService(DateRepo dateRepo){
            this.repo = dateRepo;
        }

        // ---------------------------

        public Date create(Date date){
            return repo.save(date);
        }

        public Date read(int id){
            return repo.findById(id).orElse(null);
        }

        public Date update(Date date){
            return repo.save(date);
        }

        public boolean delete(int id){
            repo.deleteById(id);
            return true;
        }

        public List<Date> getAll(){
            return repo.findAll();
        }

//    @Override
//    public Date findById(Integer id) {
//        Optional<Date> date = dateRepo.findById(id);
//        return date.orElse(null);
//    }
}
