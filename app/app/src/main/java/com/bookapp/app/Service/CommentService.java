package com.bookapp.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.app.Entity.Comment;
import com.bookapp.app.Repository.CommentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment getCommentById(Long id) {
        return commentRepository.findById(id)
                                .orElseThrow(() -> new EntityNotFoundException("Comment not found with id: " + id));
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Other methods for comment-related operations
}
