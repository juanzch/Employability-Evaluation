package com.riwi.Employability_Evaluation.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.riwi.Employability_Evaluation.domain.entities.Coupon;

public interface CouponRepository  extends JpaRepository<Coupon, String> {

    
}
