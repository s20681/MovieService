package com.s20681.MovieService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MovieController {

    @RequestMapping("/exception")
    void throwException2() throws RuntimeException{
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tresc_naszego_błędu");
    }
}
