package com.pgrrr.threelines.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ContentResponseDto {

    private String contentAddr;
    private String contentSummary;
    private String contentTitle;
    private String contentType;

}
