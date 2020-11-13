package com.cg.iba.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DetailsNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DetailsNotFoundException(String message) {
        super(message);
    }
}