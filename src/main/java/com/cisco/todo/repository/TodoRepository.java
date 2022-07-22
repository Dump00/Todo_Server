package com.cisco.todo.repository;

import com.cisco.todo.dto.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
