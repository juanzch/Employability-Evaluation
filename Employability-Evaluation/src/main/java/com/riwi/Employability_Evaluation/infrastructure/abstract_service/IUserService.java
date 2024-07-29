package com.riwi.Employability_Evaluation.infrastructure.abstract_service;

import com.riwi.Employability_Evaluation.api.dto.request.UserRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.api.dto.response.UserResponse;

public interface IUserService extends Create<UserRequest, UserResponse>{
}
