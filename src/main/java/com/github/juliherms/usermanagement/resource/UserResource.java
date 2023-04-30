package com.github.juliherms.usermanagement.resource;

import com.github.juliherms.usermanagement.exception.ExceptionHandling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser(){
        return "application works";
    }
}
