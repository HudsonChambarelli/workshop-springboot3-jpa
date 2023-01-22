package com.domain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
