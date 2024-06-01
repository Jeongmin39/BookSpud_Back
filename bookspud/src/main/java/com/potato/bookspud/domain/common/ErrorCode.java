package com.potato.bookspud.domain.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorCode {
    // 400 BAD REQUEST
    REQUEST_VALIDATION_EXCEPTION(BAD_REQUEST, "잘못된 요청입니다."),

    // 401 UNAUTHORIZED

    // 403 FORBIDDEN

    // 404 NOT FOUND
    NOT_FOUND_RECENT_BOOK_EXCEPTION(NOT_FOUND, "RecentBook이 존재하지 않습니다."),
    NOT_FOUND_RECENT_USER_EXCEPTION(NOT_FOUND, "RecentUser가 존재하지 않습니다."),

    // 500 INTERNAL SERVER ERROR
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러가 발생했습니다.");

    private final HttpStatus httpStatus;
    private final String message;

    public int getHTTPStatusCode(){
        return httpStatus.value();
    }
}
