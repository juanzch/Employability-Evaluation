package com.riwi.Employability_Evaluation.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.Employability_Evaluation.api.dto.request.UserRequest;
import com.riwi.Employability_Evaluation.api.dto.response.UserResponse;
import com.riwi.Employability_Evaluation.domain.entities.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {


    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "coupons", ignore = true)
    })

    User toUser(UserRequest userRequest);

    UserResponse  toUserResponse(User user);  
}
