package com.riwi.Employability_Evaluation.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.Employability_Evaluation.api.dto.request.UseCouponRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponUsedResponse;
import com.riwi.Employability_Evaluation.domain.entities.Coupon;

import org.mapstruct.Mapping;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CouponAdvancedMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(source = "user_id", target = "user.id"),
        @Mapping(source = "product_id", target = "product.id"),
        @Mapping(target = "state", ignore = true)
    })
    Coupon toUseCouponRequest(UseCouponRequest useCouponRequest);

    @Mappings ({
        @Mapping(source = "user.id", target = "user_id"),
        @Mapping(source = "product.id", target = "product_id")
    })
    CouponUsedResponse toCouponUsedResponse(Coupon coupon);

}
