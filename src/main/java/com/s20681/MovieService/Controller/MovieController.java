package com.s20681.MovieService.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @RequestMapping("/exception")
    void throwException() throws RuntimeException{
        throw new RuntimeException("tresc_naszego_błędu");
    }
}
