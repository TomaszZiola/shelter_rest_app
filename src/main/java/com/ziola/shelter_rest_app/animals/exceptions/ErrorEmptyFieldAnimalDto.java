package com.ziola.shelter_rest_app.animals.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorEmptyFieldAnimalDto {

    String warningMessage;
}
