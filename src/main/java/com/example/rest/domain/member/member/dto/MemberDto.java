package com.example.rest.domain.member.member.dto;

import com.example.rest.domain.member.member.entity.Member;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberDto {

    private final long id;
    @JsonProperty("createAt")
    private final LocalDateTime createdDate;
    @JsonProperty("modifiedAt")
    private final LocalDateTime modifiedDate;
    private final String username;
    private final String password;
    private final String nickname;


    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.password = member.getPassword();
        this.nickname = member.getNickname();
        this.modifiedDate = member.getModifiedDate();
        this.createdDate = member.getCreatedDate();
    }
}
