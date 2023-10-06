package com.pgrrr.threelines.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public enum LanguageCode {
    ENGLISH("en"),
    CHINESE("zh"),
    JAPANESE("ja"),
    KOREAN("ko");

    private final String code;
}
