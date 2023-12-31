package com.pgrrr.threelines.exception;

import lombok.AccessLevel;
import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public enum ApiErrorCode implements ExceptionInfo {
    
    SUBSCRIPTION_NOT_FOUND(HttpStatus.BAD_REQUEST, "Subscription not found"),
    INVALID_SUBSCRIPTION(HttpStatus.BAD_REQUEST, "Invalid subscription"),
    DUPLICATE_CONTENT_ERROR(HttpStatus.BAD_REQUEST, "Duplicate content detected");

    private final HttpStatus httpStatusType;
    private final String message;

    @Override
    public Class<? extends Exception> getExceptionClass() {
        return Exception.class;
    }

    @Override
    public String getPrefix() {
        return "API";
    }

    @Override
    public HttpStatus getHttpStatusType() {
        return httpStatusType;
    }
    
}

