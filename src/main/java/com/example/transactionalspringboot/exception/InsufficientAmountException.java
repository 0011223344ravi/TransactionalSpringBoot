package com.example.transactionalspringboot.exception;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String msg){
        super(msg);
    }
}
