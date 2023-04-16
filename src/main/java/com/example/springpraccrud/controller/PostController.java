package com.example.springpraccrud.controller;

import com.example.springpraccrud.dto.PostRequestDto;
import com.example.springpraccrud.dto.ResponseDto;
import com.example.springpraccrud.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;
    @PostMapping("/api/posts")
    public ResponseDto<?> createPost(@RequestBody PostRequestDto requstDto){
        return postService.createPost(requstDto);
    }

    @GetMapping("/api/posts")
    public ResponseDto<?> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/api/posts/{id}")
    public ResponseDto<?> getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PutMapping("/api/posts/{id}")
    public ResponseDto<?> updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto){

        return postService.update(id, requestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public ResponseDto<?> deletePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        return postService.deletePost(id, requestDto);
    }
}
