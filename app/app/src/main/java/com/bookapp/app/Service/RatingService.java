package com.bookapp.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.app.Entity.Rating;
import com.bookapp.app.Repository.RatingRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public Rating getRatingById(Long id) {
        return ratingRepository.findById(id)
                               .orElseThrow(() -> new EntityNotFoundException("Rating not found with id: " + id));
    }

    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    // Other methods for rating-related operations
}
