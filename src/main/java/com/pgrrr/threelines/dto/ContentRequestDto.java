package com.pgrrr.threelines.dto;

import com.pgrrr.threelines.domain.Content;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
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
