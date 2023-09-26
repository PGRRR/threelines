package com.pgrrr.threelines.exception;

import org.springframework.http.HttpStatus;

public interface ExceptionInfo {
    public Class<? extends Exception> getExceptionClass();

    public String getPrefix();

    public HttpStatus getHttpStatusType();
}
