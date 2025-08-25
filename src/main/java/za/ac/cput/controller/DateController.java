package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Date;
import za.ac.cput.service.DateService;

import java.util.List;

    @RestController
    @RequestMapping("/date")
    public class DateController {

        private DateService service;

        @Autowired
        public DateController(DateService dateService){
            service = dateService;
        }

        @GetMapping("get/date/{id}")
        public Date read(@PathVariable int id){
            return service.read(id);
        }

        @GetMapping("/get/dates")
        public List<Date> getAll(){
            return service.getAll();
        }

        @PostMapping("/create")
        public Date create(@RequestBody Date date){
            return service.create(date);
        }

        @PutMapping("/update")
        public Date update(@RequestBody Date date){
            return service.update(date);
        }

        @DeleteMapping("/delete")
        public boolean delete(@RequestBody int id){
            return service.delete(id);
        }
}
