package com.freelance.sport_club.exception;

public class SCBaseException extends Exception {

    private int code;
    private String message;
    private Throwable errCause;

    public SCBaseException(String message, Throwable errCause) { super(message, errCause); }

    public SCBaseException(int code, String message, Throwable errCause) {
        this.code = code;
        this.message = message;
        this.errCause = errCause;
    }

}
