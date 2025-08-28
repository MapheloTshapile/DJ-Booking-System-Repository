package za.ac.cput.service;
import za.ac.cput.domain.Review;

import java.util.List;
import java.util.Optional;


public interface IReviewService {

    Review findById(Integer id);
    List<Review> getAll();

}