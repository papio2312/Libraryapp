package com.example.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

      // Getter method for the id field
      public Long getId() {
        return id;
    }

    // Setter method for the id field
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }
}
