package auto.from.spring.data.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
    List<Person> findByNom(String nom);

	
}
