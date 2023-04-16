package com.example.springpraccrud.repository;

import com.example.springpraccrud.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.LinkedList;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    LinkedList<Post> findAllByOrderByModifiedAtDesc();

}
