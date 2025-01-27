package com.example.rest.domain.post.post.dto;

import com.example.rest.domain.post.post.entity.Post;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {

    private final long id;
    @JsonProperty("createAt")
    private final LocalDateTime createdDate;
    @JsonProperty("modifiedAt")
    private final LocalDateTime modifiedDate;
    private final String title;
    private final String content;


    public PostDto(Post post) {
        this.id = post.getId();
        this.createdDate = post.getCreatedDate();
        this.modifiedDate = post.getModifiedDate();
        this.title = post.getTitle();
        this.content = post.getContent();
    }
}
