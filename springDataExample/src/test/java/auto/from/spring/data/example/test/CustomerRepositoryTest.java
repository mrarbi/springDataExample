package auto.from.spring.data.example.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import auto.from.spring.data.example.Customer;
import auto.from.spring.data.example.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-jpa_mysql.xml" })
public class CustomerRepositoryTest {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	public void test() {
		
		customerRepository.save(new Customer("Moa", "test"));
		customerRepository.save(new Customer("Done", "vip"));
		
		List<Customer> customers = customerRepository.findByLastName("test");
		
		assertNotNull(customers);
		
		if (null != customers) {
			
			for (Customer customer : customers) {
				System.out.println("Id : " + customer.getId());
				System.out.println("FirstName : " + customer.getFirstName());
				System.out.println("LastName : " + customer.getLastName());
				System.out.println("---------");
			}
		}
		
		customers = customerRepository.findByFirstNameQuery("Done");
		
		assertNotNull(customers);
		
		if (null != customers) {
			
			for (Customer customer : customers) {
				System.out.println("Id : " + customer.getId());
				System.out.println("FirstName : " + customer.getFirstName());
				System.out.println("LastName : " + customer.getLastName());
				System.out.println("---------");
			}
		}
		
	}

}
