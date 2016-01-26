package auto.from.spring.batch;

import org.springframework.batch.item.ItemProcessor;

import auto.from.spring.data.example.Person;

public class PersonProcessor implements ItemProcessor<Person, Person> {

	public Person process(final Person personneInput) throws Exception {

		Person personneOutput = null;

		// si la civilite a la valeur M la personne sera ecrite en base sinon on
		// la rejette
//		if ("M".equals(personneInput.getCivilite())) {
		personneOutput = new Person();
		personneOutput.setCivilite(personneInput.getCivilite());
		personneOutput.setId(personneInput.getId());
		personneOutput.setNom(personneInput.getNom());
		personneOutput.setPrenom(personneInput.getPrenom());
//		}

		return personneOutput;

	}

}