package com.ziola.shelter_rest_app.animals.exceptions;

public class EmptyAnimalDtoFieldException extends RuntimeException{

    public EmptyAnimalDtoFieldException(String message) {
        super(message);
    }
}
