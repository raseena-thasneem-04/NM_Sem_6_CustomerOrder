package com.adithya.customer_orders.repository;

import com.adithya.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author adithya
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
