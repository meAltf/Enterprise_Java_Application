package com.alataf.customer.dal.restfulwebservicescustomer.repos;

import org.springframework.data.repository.CrudRepository;

import com.alataf.customer.dal.restfulwebservicescustomer.entities.Customer;

//created repository interface and extends it with CrudRepository for CRUD operation of API.
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
