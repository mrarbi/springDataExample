package auto.from.spring.hello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    
    public final static String FIND_BY_ADDRESS_QUERY = "SELECT p " + 
                                                       "FROM Person p LEFT JOIN p.addresses a " +
                                                       "WHERE a.address = :address";

    /**
     * Find persons like first name.
     */
    public List<Person> findByFirstNameLike(String firstName);

    /**
     * Find persons by last name.
     */
    public List<Person> findByLastName(String lastName);

    /**
     * Find persons by address.
     */
    @Query(FIND_BY_ADDRESS_QUERY)
    public List<Person> findByAddress(@Param("address") String address);

    
}