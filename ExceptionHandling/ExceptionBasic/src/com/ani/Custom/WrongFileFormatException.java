package com.ani.Custom;

public class WrongFileFormatException extends Exception {

    private String cause; 
    private String remedy;   

    public WrongFileFormatException(String message) {
        super(message);
    }
}