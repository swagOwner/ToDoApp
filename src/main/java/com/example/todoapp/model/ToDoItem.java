package com.example.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity//сущность
public class ToDoItem {

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    public ToDoItem(String title) {
        this.title = title;
    }

    public ToDoItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
