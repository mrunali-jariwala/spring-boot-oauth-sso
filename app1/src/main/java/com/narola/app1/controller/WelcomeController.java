package com.narola.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WelcomeController {

    @GetMapping(value = "/")
    public String index(Principal principal) {
        return "Welcome to App1, " + principal.getName() + "!";
    }

    @GetMapping(value = "/home")
    public String home() {
        return "Home!";
    }
}
