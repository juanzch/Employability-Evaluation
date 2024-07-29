package com.riwi.Employability_Evaluation.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/coupons")
@Tag(name = "Product", description = "Product API")
public class ProductController {


    @GetMapping(path = "/products")
    public String getProducts() {
        return "Lista productos";
    }


}
