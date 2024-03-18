package com.bookapp.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.app.Entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    // You can add custom query methods here if needed
}
