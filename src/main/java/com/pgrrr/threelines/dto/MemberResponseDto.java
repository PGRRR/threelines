package com.pgrrr.threelines.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberResponseDto {
    
    private String memberEmail;
    private String memberNm;
    private String memberPw;

}
