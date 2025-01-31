package com.example.rest.domain.post.post.entity;

import com.example.rest.domain.member.member.entity.Member;
import com.example.rest.global.entity.BaseTime;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Member author;
}
