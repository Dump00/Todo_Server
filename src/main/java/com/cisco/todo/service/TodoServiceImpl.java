package com.cisco.todo.service;

import com.cisco.todo.dto.RequestDTO;
import com.cisco.todo.dto.TodoDTO;
import com.cisco.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

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
