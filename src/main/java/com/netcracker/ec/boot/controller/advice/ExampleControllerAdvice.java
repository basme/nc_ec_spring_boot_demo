package com.netcracker.ec.boot.controller.advice;

import com.netcracker.ec.boot.exception.SomeBusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExampleControllerAdvice {

    @ExceptionHandler(SomeBusinessException.class)
    protected ResponseEntity<String> handleBusinessError() {
        return new ResponseEntity<>("Some business error occured. Do the following: ...", HttpStatus.CONFLICT);
    }

}
