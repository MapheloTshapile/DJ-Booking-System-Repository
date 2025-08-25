package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer> {
    // This interface will inherit methods for CRUD operations from JpaRepository
    // No additional methods are needed at this time

}
