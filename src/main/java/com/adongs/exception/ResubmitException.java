package com.adongs.exception;


/**
 * 幂等校验
 * @author adong
 * @version 1.0
 */
public class ResubmitException extends RuntimeException {

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ResubmitException(String message) {
        super(message);
    }

}
