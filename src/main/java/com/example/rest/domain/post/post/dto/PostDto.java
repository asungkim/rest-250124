package com.example.rest.domain.post.post.dto;

import com.example.rest.domain.post.post.entity.Post;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {

    private final long id;
    @JsonProperty("createDateTime")
    private final LocalDateTime createdDate;
    @JsonProperty("modifiedDateTime")
    private final LocalDateTime modifiedDate;
    private final String title;
    private final String content;
    private final long authorId;
    private final String authorName;


    public PostDto(Post post) {
        this.id = post.getId();
        this.createdDate = post.getCreatedDate();
        this.modifiedDate = post.getModifiedDate();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.authorId=post.getAuthor().getId();
        this.authorName=post.getAuthor().getNickname();
    }
}
