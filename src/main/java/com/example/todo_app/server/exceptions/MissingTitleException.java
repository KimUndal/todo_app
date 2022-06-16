package com.example.todo_app.server.exceptions;

public class MissingTitleException extends Exception{
    public MissingTitleException(String message){
        super(message);
    }
}
