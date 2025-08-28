package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Review;
import za.ac.cput.service.ReviewService;

import java.util.List;

    @RestController
    public class ReviewController {

        private ReviewService service;

        @Autowired
        public ReviewController(ReviewService reviewService){
            service = reviewService;
        }

        @GetMapping("get/review/{id}")
        public Review read(@PathVariable int id){
            return service.read(id);
        }

        @GetMapping("/get/reviews")
        public List<Review> getAll(){
            return service.getAll();
        }

        @PostMapping("/create")
        public Review create(@RequestBody Review review){
            return service.create(review);
        }

        @PutMapping("/update")
        public Review update(@RequestBody Review review){
            return service.update(review);
        }

        @DeleteMapping("/delete")
        public boolean delete(@RequestBody int id){
            return service.delete(id);
        }
    }

