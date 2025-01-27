package com.example.rest.domain.post.post.entity;

import com.example.rest.global.BaseTime;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
public class Post extends BaseTime {

    private String title;
    private String content;
}
