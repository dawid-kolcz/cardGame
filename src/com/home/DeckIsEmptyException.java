package com.home;

public class DeckIsEmptyException extends Exception{
    public DeckIsEmptyException(){}
    public DeckIsEmptyException(String message){
        super(message);
    }
    public DeckIsEmptyException(String message, Throwable cause){
        super(message, cause);
    }
}
