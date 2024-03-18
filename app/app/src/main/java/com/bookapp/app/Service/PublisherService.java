package com.bookapp.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.app.Entity.Publisher;
import com.bookapp.app.Repository.PublisherRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public Publisher getPublisherById(Long id) {
        return publisherRepository.findById(id)
                                  .orElseThrow(() -> new EntityNotFoundException("Publisher not found with id: " + id));
    }

    public Publisher createPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    // Other methods for publisher-related operations
}
