package com.riwi.Employability_Evaluation.config;
//Para configurar beans dentro de spring

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Api para la  Gestión y Redención de Cupones ", version = "S.0", description = "Esta api fue creada para gestionar de manera eficiente los cupones, usuarios y productos\n" +
        "del ecommerce de RIWI."))
public class OpenApiConfig {

}