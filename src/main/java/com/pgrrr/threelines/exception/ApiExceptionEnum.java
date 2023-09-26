package com.pgrrr.threelines.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApiExceptionEnum implements ExceptionInfo {
    
    SUBSCRIPTION_NOT_FOUND(HttpStatus.BAD_REQUEST, "Subscription not found"),
    INVALID_SUBSCRIPTION(HttpStatus.BAD_REQUEST, "Invalid subscription"),
    SUBSCRIPTION_EXPIRED(HttpStatus.BAD_REQUEST, "Subscription expired");

    private final HttpStatus httpStatusType;
    private final String message;

    @Override
    public Class<? extends Exception> getExceptionClass() {
        return Exception.class; // You can adjust this based on your actual exception hierarchy.
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

