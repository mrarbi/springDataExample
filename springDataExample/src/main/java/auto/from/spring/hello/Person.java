package auto.from.spring.hello;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Person {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;

	private String lastName;

	private String companyName;

	private Date created;

	private Set<Address> Addresses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Set<Address> getAddresses() {
		return Addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		Addresses = addresses;
	}

}
