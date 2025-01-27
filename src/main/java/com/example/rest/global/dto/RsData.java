package com.example.rest.global.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RsData {
    private String code;
    private String msg;
    private Object data;

    public RsData(String msg, String code) {
        this(code,msg,null);
    }
}
