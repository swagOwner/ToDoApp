package com.example.todoapp.repositories;

import com.example.todoapp.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<ToDoItem, Long> {

}
