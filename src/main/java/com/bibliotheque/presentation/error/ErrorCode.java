package com.bibliotheque.presentation.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    BOOK_NOT_FOUND(HttpStatus.NOT_FOUND, "BOOK_NOT_FOUND"),
    BOOK_NOT_AVAILABLE(HttpStatus.CONFLICT, "BOOK_NOT_AVAILABLE"),
    BORROW_LIMIT_EXCEEDED(HttpStatus.UNPROCESSABLE_ENTITY, "BORROW_LIMIT_EXCEEDED"),
    VALIDATION_ERROR(HttpStatus.BAD_REQUEST, "VALIDATION_ERROR"),
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_ERROR");

    private final HttpStatus status;
    private final String code;
}
