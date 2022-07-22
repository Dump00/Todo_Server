package com.cisco.todo.api;

import com.cisco.todo.dto.RequestDTO;
import com.cisco.todo.dto.TodoDTO;
import com.cisco.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/get")
    public List<TodoDTO> getAllToDos() {
        return todoService.getAllToDos();
    }

    @PostMapping("/post")
    public void saveTodo(@RequestBody RequestDTO requestDTO) {
        todoService.saveTodo(requestDTO);
    }

    @PutMapping("/update")
    public void updateTodo(@RequestBody TodoDTO todo) {
        todoService.updateTodo(todo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTodo(@PathVariable long id) {
        todoService.deleteTodo(id);
    }
}
