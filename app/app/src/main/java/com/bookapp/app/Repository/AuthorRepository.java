package com.bookapp.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.app.Entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // You can add custom query methods here if needed
}
