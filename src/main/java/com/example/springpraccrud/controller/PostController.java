package com.example.springpraccrud.controller;

import com.example.springpraccrud.dto.PostRequestDto;
import com.example.springpraccrud.entity.Post;
import com.example.springpraccrud.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
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
    public List<Post> getPosts(){
        return postService.getPosts();
    }
    @GetMapping("/api/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto){

        return postService.update(id, requestDto);
    }
}
