package com.pgrrr.threelines.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SubscriptionResponseDto {

    private String subTitle;
    private String subType;

}
