package com.ziola.shelter_rest_app.animals.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmptyAnimalDtoFieldExceptionHandler {

    @ExceptionHandler(EmptyAnimalDtoFieldException.class)
    public ResponseEntity<ErrorEmptyFieldAnimalDto> fieldsAreEmpty(EmptyAnimalDtoFieldException e) {
        var error = new ErrorEmptyFieldAnimalDto(e.getMessage());
        return new ResponseEntity<ErrorEmptyFieldAnimalDto>(error, HttpStatus.BAD_REQUEST);
    }
}
