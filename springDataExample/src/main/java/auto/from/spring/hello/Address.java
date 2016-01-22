package auto.from.spring.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Address {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zipPostal;
	
	private String country;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipPostal() {
		return zipPostal;
	}

	public void setZipPostal(String zipPostal) {
		this.zipPostal = zipPostal;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
