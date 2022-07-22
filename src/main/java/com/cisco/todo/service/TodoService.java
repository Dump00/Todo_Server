package com.cisco.todo.service;

import com.cisco.todo.dto.Todo;


import java.util.List;

public interface TodoService {
    List<Todo> getAllToDos();
    void saveTodo(String todoItem);
    void updateTodo(Todo todo);
    void deleteTodo(long id);
}
