package com.alataf.customer.dal.restfulwebservicescustomer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alataf.customer.dal.restfulwebservicescustomer.entities.Customer;
import com.alataf.customer.dal.restfulwebservicescustomer.repos.CustomerRepository;

//creating these functions for testing purpose.
@SpringBootTest
class RestfulWebServicesCustomerApplicationTests {

	@Autowired
	private CustomerRepository repo;
	
	
	@Test
	void CustomerRepository() {
		Customer customer = new Customer();
		customer.setName("Alataf");
		customer.setEmail("alataf@google.com");
		repo.save(customer);
	}
	
	@Test
	void testFindCustomerById() {
		Customer customer= repo.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	void testUpdateCustomer() {
		Customer customer = repo.findById(1l).get();
		customer.setEmail("robert@walmart.org");
		repo.save(customer);
		
	}
	
	@Test
	void testDeleteCustomer() {
		Customer customer = repo.findById(1l).get();
		repo.delete(customer);
	}

}
