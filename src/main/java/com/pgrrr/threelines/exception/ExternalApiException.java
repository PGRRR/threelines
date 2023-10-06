package com.pgrrr.threelines.exception;

import lombok.Getter;

@Getter
public class ExternalApiException extends RuntimeException {

    private final ApiErrorCode apiErrorCode;

    public ExternalApiException(ApiErrorCode apiErrorCode) {
        super(apiErrorCode.getMessage());
        this.apiErrorCode = apiErrorCode;
    }
}
