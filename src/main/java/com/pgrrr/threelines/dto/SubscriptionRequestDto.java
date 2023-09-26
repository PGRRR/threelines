package com.pgrrr.threelines.dto;

import com.pgrrr.threelines.domain.Subscription;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class SubscriptionRequestDto {

    private String subTitle;
    private String subType;

    public Subscription toEntity(){
        return Subscription.builder()
        .subTitle(this.subTitle)
        .subType(this.subType)
        .build();
    }
}
