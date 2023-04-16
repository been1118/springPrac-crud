package com.example.springpraccrud.service;

import com.example.springpraccrud.dto.PostRequestDto;
import com.example.springpraccrud.entity.Post;
import com.example.springpraccrud.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Post createPost(PostRequestDto requstDto) {
        Post post = new Post(requstDto);
        postRepository.save(post);
        return post;
    }

    @Transactional(readOnly = true)
    public List<Post> getPost() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }
}
