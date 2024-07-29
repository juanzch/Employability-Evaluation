package com.riwi.Employability_Evaluation.infrastructure.abstract_service;

import com.riwi.Employability_Evaluation.api.dto.response.CouponResponse;
import com.riwi.Employability_Evaluation.api.dto.response.ProductResponse;

public interface IProductService extends GetAll<ProductResponse>,Get<CouponResponse,String>{
}
