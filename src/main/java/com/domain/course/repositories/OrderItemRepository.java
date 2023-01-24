package com.domain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
