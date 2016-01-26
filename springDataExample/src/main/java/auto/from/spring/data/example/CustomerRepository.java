package auto.from.spring.data.example;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	public final static String FIND_BY_FIRSTNAME_QUERY = "SELECT c FROM Customer c WHERE c.firstName = :firstName";

    List<Customer> findByLastName(String lastName);

	/**
	* Find persons by address.
	*/
	@Query(FIND_BY_FIRSTNAME_QUERY)
	public List<Customer> findByFirstNameQuery(@Param("firstName") String firstName);
	
//	public void deleteAll();
	
	
}
