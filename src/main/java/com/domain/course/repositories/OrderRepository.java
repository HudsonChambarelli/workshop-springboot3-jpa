package com.domain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
