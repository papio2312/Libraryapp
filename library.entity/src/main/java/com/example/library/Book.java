package com.example.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    // Getters and setters


      // Getter method for id
      public Long getId() {
        return id;
    }

    // Setter method for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for author
    public Author getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(Author author) {
        this.author = author;
    }
}