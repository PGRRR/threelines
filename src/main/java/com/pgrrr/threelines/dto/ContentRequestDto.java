package com.pgrrr.threelines.dto;

import com.pgrrr.threelines.domain.Content;

import lombok.Getter;

@Getter
public class ContentRequestDto {

    private Long contentNo;
    private String contentSummary;
    private String contentTitle;
    private String contentType;

    public Content toEntity(){
        return Content.builder()
        .contentNo(this.contentNo)
        .contentSummary(this.contentSummary)
        .contentTitle(this.contentTitle)
        .contentType(this.contentType)
        .build();
    }
}
