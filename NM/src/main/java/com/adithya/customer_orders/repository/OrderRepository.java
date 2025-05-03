package com.adithya.customer_orders.repository;

import com.adithya.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author adithya
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
