package com.bookapp.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.app.Entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    // You can add custom query methods here if needed
}
