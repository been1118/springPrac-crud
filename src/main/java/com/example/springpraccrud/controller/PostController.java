package com.example.springpraccrud.controller;

import com.example.springpraccrud.dto.PostRequestDto;
import com.example.springpraccrud.entity.Post;
import com.example.springpraccrud.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;
    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostRequestDto requstDto){
        return postService.createPost(requstDto);
    }

    @GetMapping("/api/posts")
    public List<Post> getPost(){
        return postService.getPost();
    }
}
