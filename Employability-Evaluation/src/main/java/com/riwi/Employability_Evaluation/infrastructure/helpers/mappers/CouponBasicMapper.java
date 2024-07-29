package com.riwi.Employability_Evaluation.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.Employability_Evaluation.api.dto.request.CouponRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.domain.entities.Coupon;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CouponBasicMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "user", ignore = true),
        @Mapping(target = "product", ignore = true),
        @Mapping(target = "state", ignore = true)
    })
    Coupon toCouponBasic(CouponRequest couponBasicDTO);


    CouponResponse toCouponResponse(Coupon coupon);
        

}
