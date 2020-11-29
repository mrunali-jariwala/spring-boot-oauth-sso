package com.optidesk.ssoserver.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }

    /*@GetMapping("/sso-server/login")
    public String authentication() {
        return "login";
    }*/
}
