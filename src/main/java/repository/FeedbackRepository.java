package repository;

import com.example.phase3week1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<User,Integer> {
}
