package com.domain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
