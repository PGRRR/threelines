package com.pgrrr.threelines.dto;

import com.pgrrr.threelines.domain.Member;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequestDto {

    private String memberEmail;

    private String memberNm;

    private String memberPw;

    public Member toEntity(){
        return Member.builder()
        .memberEmail(this.memberEmail)
        .memberNm(this.memberNm)
        .memberPw(this.memberPw)
        .build();
    }
}
