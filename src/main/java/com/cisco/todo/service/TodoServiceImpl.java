package com.cisco.todo.service;

import com.cisco.todo.dto.Todo;
import com.cisco.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAllToDos() {
        return todoRepository.findAll();
    }

    @Override
    public void saveTodo(String todoItem) {
        Todo todo = new Todo();
        todo.setTodo(todoItem);
        todoRepository.save(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }
}
