package com.riwi.Employability_Evaluation.infrastructure.abstract_service;

import com.riwi.Employability_Evaluation.api.dto.request.CouponRequest;
import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;

public interface ICouponService extends
        Create<CouponRequest, CouponResponse>
        ,GetAll<CouponResponse>
        ,Delete<String>
        ,Update<CouponRequest,CouponResponse,String>
        ,Get<CouponResponse,String>
{

}
