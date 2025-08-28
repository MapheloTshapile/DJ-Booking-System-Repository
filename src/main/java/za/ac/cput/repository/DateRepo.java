package za.ac.cput.repository;
import za.ac.cput.domain.Date;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepo extends JpaRepository<Date, Integer> {

}