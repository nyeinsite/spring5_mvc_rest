package com.example.spring5_mvc_rest.services;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){

    }
    public ResourceNotFoundException(String message){
        super(message);
    }
    public ResourceNotFoundException(Throwable cause){
        super(cause);
    }
    public ResourceNotFoundException(String message,Throwable cause,boolean enableSuppression,boolean writableStakTrace){
        super(message,cause,enableSuppression,writableStakTrace);
    }
}
