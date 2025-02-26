package ru.javabegin.oauth2.testoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/internal")
    public String internal() {
        return "internal";
    }
}