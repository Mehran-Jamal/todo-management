package com.codewitheme.todomanagement.repository;

import com.codewitheme.todomanagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
