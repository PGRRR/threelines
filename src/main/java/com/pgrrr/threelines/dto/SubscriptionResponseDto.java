package com.pgrrr.threelines.dto;

import com.pgrrr.threelines.domain.Subscription;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SubscriptionResponseDto {

    private String subTitle;
    private String subType;

    public Subscription toEntity(){
        return Subscription.builder()
        .subTitle(this.subTitle)
        .subType(this.subType)
        .build();
    }
}
