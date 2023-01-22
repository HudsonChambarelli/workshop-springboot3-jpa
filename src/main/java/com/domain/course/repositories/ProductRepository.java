package com.domain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
