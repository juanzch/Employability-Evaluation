package com.riwi.Employability_Evaluation.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/users")
@Tag(name = "User", description = "User API")
@AllArgsConstructor
public class UserController {

    @GetMapping(path = "/users")
    public String getUsers() {
        return "Lista usuarios";
    }

    @PostMapping(path = "/users")
    public String createUser() {
        return "Crear usuario";
    }

}
