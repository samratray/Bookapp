package com.bookapp.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.app.Entity.Review;
import com.bookapp.app.Repository.ReviewRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id)
                               .orElseThrow(() -> new EntityNotFoundException("Review not found with id: " + id));
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    // Other methods for review-related operations
}
