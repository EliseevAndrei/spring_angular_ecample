package app.data;

import app.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository
        extends JpaRepository<Person, Integer> {

}
