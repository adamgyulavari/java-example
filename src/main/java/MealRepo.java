import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by gyulavari on 2016.07.29..
 */
public interface MealRepo extends MongoRepository<Meal, String> {
}
