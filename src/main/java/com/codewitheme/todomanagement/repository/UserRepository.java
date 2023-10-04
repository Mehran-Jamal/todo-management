package com.codewitheme.todomanagement.repository;

import com.codewitheme.todomanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

   Optional<User> findByUsername(String username);

   Boolean existsByEmail(String email);

   Optional<User> findByUsernameOrEmail(String username, String email);

   Boolean existsByUsername(String username);
}
