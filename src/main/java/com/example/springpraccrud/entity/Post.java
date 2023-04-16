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

    public Post(PostRequestDto requstDto) {
        this.username = requstDto.getUsername();
        this.post = requstDto.getPost();
        this.password = requstDto.getPassword();
    }
}
