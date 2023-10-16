import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    
    @GetMapping("/{personId}/group")
    public Group getPersonGroup(@PathVariable Long personId) {
        Person person = personRepository.findById(personId).orElse(null);
        if (person != null) {
            return person.getGroup();
        } else {

            return null;
        }
    }
}
