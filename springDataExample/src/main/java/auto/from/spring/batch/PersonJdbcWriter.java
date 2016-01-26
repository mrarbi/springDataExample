package auto.from.spring.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import auto.from.spring.data.example.Person;
import auto.from.spring.data.example.PersonRepository;

public class PersonJdbcWriter implements ItemWriter<Person> {

	@Autowired
	PersonRepository personRepository;

	public void write(List<? extends Person> items) throws Exception {
		for (Person person : items) {
			final Object object[] = { person.getNom(), person.getPrenom(),
					person.getCivilite(), person.getId() };
			
			System.out.println(person.getId());
			System.out.println(person.getNom());
			System.out.println(person.getPrenom());
			System.out.println(person.getCivilite());
			System.out.println("--------");
			
			if(!personRepository.exists(person.getId())) {
				personRepository.save(person);
			}
			
			
			// on tente un update
//			int nbLigne = jdbcTemplate.update(REQUEST_UPDATE_PERSONNE, object);
//
//			// si le nombre de ligne mise a jour vaut 0, on fait un insert
//			if (nbLigne == 0) {
//				final Object object2[] = { person.getId(), person.getNom(),
//						person.getPrenom(), person.getCivilite() };
//				jdbcTemplate.update(REQUEST_INSERT_PERSONNE, object2);
//			} else {
//
//			}
		}
	}

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
}
