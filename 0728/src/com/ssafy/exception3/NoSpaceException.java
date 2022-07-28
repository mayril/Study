package com.ssafy.exception3;

/**
 * @since 2021. 7. 8.
 */
public class NoSpaceException extends RuntimeException {
    public NoSpaceException(String name) {
        super(name + "을 넣을 공간이 없습니다.");
    }
}
