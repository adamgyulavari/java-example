import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by gyulavari on 2016.07.29..
 */
@RestController
public class PeldaController {
    @RequestMapping(value = "/meals")
    public void deleteMore(@RequestBody ItemIds ids) {
        for(Integer i : ids.itemIds) {}
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "Its working!";
    }
}
