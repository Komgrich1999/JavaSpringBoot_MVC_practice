package com.Spring_MVC_practice1.Spring_MVC_practice1;

import org.springframework.data.repository.CrudRepository;
import com.Spring_MVC_practice1.Spring_MVC_practice1.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
