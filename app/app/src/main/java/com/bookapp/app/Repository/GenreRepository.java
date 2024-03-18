package com.bookapp.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.app.Entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    // You can add custom query methods here if needed
}
