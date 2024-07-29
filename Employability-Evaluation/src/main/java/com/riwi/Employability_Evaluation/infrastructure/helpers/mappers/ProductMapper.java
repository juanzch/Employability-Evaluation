package com.riwi.Employability_Evaluation.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.Employability_Evaluation.api.dto.request.ProductRequest;
import com.riwi.Employability_Evaluation.api.dto.response.ProductResponse;
import com.riwi.Employability_Evaluation.domain.entities.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "coupons", ignore = true)
        
    })

    Product toProduct(ProductRequest productRequest);

    ProductResponse toProductResponse(Product product);


}
