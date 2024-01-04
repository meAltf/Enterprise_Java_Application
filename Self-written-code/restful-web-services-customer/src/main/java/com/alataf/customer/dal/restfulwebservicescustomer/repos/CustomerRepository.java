package com.alataf.customer.dal.restfulwebservicescustomer.repos;

import org.springframework.data.repository.CrudRepository;

import com.alataf.customer.dal.restfulwebservicescustomer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
