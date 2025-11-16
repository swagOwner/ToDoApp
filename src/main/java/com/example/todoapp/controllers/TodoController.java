package com.example.todoapp.controllers;

import com.example.todoapp.model.ToDoItem;
import com.example.todoapp.repositories.TodoItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TodoController implements CommandLineRunner {

    private final TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping
    public String index(Model model) {

        List<ToDoItem> allTodos = todoItemRepository.findAll();
        model.addAttribute("allTodos", allTodos);
        model.addAttribute("newTodo", new ToDoItem());

        return "index";
    }

    @Override
    public void run(String... args) throws Exception {
        // Записываем два объекта ToDoItem в нашу базу данных
        todoItemRepository.save(new ToDoItem("Item 1"));
        todoItemRepository.save(new ToDoItem("Item 2"));
    }
}
