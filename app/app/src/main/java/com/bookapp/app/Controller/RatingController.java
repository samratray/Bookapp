package com.bookapp.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.app.Entity.Rating;
import com.bookapp.app.Service.RatingService;


@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getRatingById(@PathVariable("id") Long id) {
        Rating rating = ratingService.getRatingById(id);
        return ResponseEntity.ok().body(rating);
    }

    @PostMapping("/")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating savedRating = ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRating);
    }

    // Other endpoints for updating and deleting ratings
}
