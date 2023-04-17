package com.example.springpraccrud.entity;

import com.example.springpraccrud.dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Post extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String post;
    @Column(nullable = false)
    private String password;

    public Post(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.post = requestDto.getPost();
        this.password = requestDto.getPassword();
    }

    public void update(PostRequestDto postRequestDto) {
        this.post = postRequestDto.getPost();
    }
}
