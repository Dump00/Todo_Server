package com.cisco.todo.service;

import com.cisco.todo.dto.RequestDTO;
import com.cisco.todo.dto.TodoDTO;


import java.util.List;
import java.util.Optional;

public interface TodoService {
    Optional<TodoDTO> getTodo(long id);
    List<TodoDTO> getAllToDos();
    void saveTodo(RequestDTO requestDTO);
    void updateTodo(TodoDTO todo);
    void deleteTodo(long id);
}
