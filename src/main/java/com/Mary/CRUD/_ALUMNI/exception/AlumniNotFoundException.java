package com.Mary.CRUD._ALUMNI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AlumniNotFoundException extends RuntimeException{

    public AlumniNotFoundException(String message){
        super(message);
    }
}
