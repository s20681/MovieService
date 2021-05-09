package com.s20681.MovieService.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<Object> handleRuntimeException(RuntimeException e){
        return ResponseEntity.ok(e.getMessage());
    }

}
