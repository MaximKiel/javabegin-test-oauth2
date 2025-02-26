package ru.javabegin.oauth2.testoauth2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/delete")
    @PreAuthorize("hasRole('admin')")
    public String delete() {
        return "delete";
    }

    @GetMapping("/add")
    @PreAuthorize("hasRole('admin')")
    public String add() {
        return "add";
    }

    @GetMapping("/view")
    @PreAuthorize("hasRole('user')")
    public String view() {
        return "view";
    }
}