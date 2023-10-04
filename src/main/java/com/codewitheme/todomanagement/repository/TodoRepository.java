package com.codewitheme.todomanagement.repository;

import com.codewitheme.todomanagement.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TodoRepository extends JpaRepository<Todo,Long> {
}
