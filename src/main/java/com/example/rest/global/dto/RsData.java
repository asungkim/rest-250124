package com.example.rest.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RsData {
    private String code;
    private String msg;
    private long id;

    public RsData(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }
}
