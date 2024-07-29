package com.riwi.Employability_Evaluation.config;
//Para configurar beans dentro de spring

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "API for Coupon Management and Redemption", version = "S.0", description = "This API was created to efficiently manage RIWI ecommerce coupons, users and products."))
public class OpenApiConfig {

}