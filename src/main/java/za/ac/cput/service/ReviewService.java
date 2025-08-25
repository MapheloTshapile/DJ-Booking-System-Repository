package za.ac.cput.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Date;
import za.ac.cput.domain.Review;
import za.ac.cput.repository.DateRepo;
import za.ac.cput.repository.ReviewRepo;

import java.util.List;

@Service
    public class ReviewService {
        ReviewRepo repo;
        @Autowired
        public ReviewService(ReviewRepo reviewRepo){
            this.repo = reviewRepo;
        }
        // ---------------------------

        public Review create(Review review){
            return repo.save(review);
        }

        public Review read(int id){
            return repo.findById(id).orElse(null);
        }

        public Review update(Review review){
            return repo.save(review);
        }

        public boolean delete(int id){
            repo.deleteById(id);
            return true;
        }

        public List<Review> getAll(){
            return repo.findAll();
        }
}
