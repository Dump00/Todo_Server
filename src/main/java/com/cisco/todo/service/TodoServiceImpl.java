package com.cisco.todo.service;

import com.cisco.todo.dto.RequestDTO;
import com.cisco.todo.dto.TodoDTO;
import com.cisco.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Optional<TodoDTO> getTodo(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public List<TodoDTO> getAllToDos() {
        return todoRepository.findAll();
    }

    @Override
    public void saveTodo(RequestDTO requestDTO) {
        TodoDTO todo = new TodoDTO();
        todo.setTodo(requestDTO.getTodoItem());
        todoRepository.save(todo);
    }

    @Override
    public void updateTodo(TodoDTO todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(long id) {
        todoRepository.deleteById(id);
    }
}
