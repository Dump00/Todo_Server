package com.cisco.todo.api;

import com.cisco.todo.dto.Todo;
import com.cisco.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("api/v1/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllToDos() {
        return todoService.getAllToDos();
    }

    @PostMapping
    public void saveTodo(@PathVariable String todoItem) {
        todoService.saveTodo(todoItem);
    }

    @PutMapping
    public void updateTodo(@RequestBody Todo todo) {
        todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable long id) {
        todoService.deleteTodo(id);
    }
}
