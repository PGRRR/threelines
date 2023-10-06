package com.pgrrr.threelines.dto;

import com.pgrrr.threelines.domain.Content;

import com.pgrrr.threelines.enums.LanguageCode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ContentRequestDto {

    @NotEmpty(message = "")
    private Long contentNo;
    @NotEmpty(message = "")
    private String contentAddr;
    @NotEmpty(message = "")
    @Size(max = 2, message = "")
    private LanguageCode contentLang;
    private String contentTitle;
    private String contentType;

    public Content toEntity(){
        return Content.builder()
        .contentNo(this.contentNo)
        .contentAddr(this.contentAddr)
        .contentLang(this.contentLang)
        .contentTitle(this.contentTitle)
        .contentType(this.contentType)
        .build();
    }
}
