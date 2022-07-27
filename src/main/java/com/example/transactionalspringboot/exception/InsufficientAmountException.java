package com.example.transactionalspringboot.exception;

public class InsufficientAmountException extends Exception {
    public InsufficientAmountException(String msg){
        super(msg);
    }
}
