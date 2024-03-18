package com.bookapp.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.app.Entity.Genre;
import com.bookapp.app.Repository.GenreRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public Genre getGenreById(Long id) {
        return genreRepository.findById(id)
                              .orElseThrow(() -> new EntityNotFoundException("Genre not found with id: " + id));
    }

    public Genre createGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    // Other methods for genre-related operations
}
