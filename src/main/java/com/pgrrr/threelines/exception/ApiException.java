package com.pgrrr.threelines.exception;

import org.springframework.http.HttpStatus;

public enum ApiException implements ExceptionInfo{
    ;

    @Override
    public Class<? extends Exception> getExceptionClass() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getExceptionClass'");
    }

    @Override
    public String getPrefix() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrefix'");
    }

    @Override
    public HttpStatus getHttpStatusType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHttpStatusType'");
    }

}
