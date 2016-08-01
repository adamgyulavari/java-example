import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gyulavari on 2016.07.29..
 */
@SpringBootApplication
public class Application {

    @Autowired
    private MealRepo repository;

    public void lofasz() {
        repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
