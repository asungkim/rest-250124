package com.example.rest.domain.post.post.dto;

import com.example.rest.domain.post.post.entity.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {

    private final long id;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;
    private final String title;
    private final String content;


    public PostDto(Post post) {
        this.id = post.getId();
        this.createdAt = post.getCreatedDate();
        this.modifiedAt = post.getModifiedDate();
        this.title = post.getTitle();
        this.content = post.getContent();
    }
}
