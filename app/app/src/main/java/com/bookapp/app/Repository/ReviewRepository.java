package com.bookapp.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.app.Entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    // You can add custom query methods here if needed
}
